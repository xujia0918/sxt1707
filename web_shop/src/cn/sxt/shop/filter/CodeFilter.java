package cn.sxt.shop.filter;

import java.io.IOException;

import java.io.UnsupportedEncodingException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
/*
 * 解决乱码问题
 * @author xujia 
 */
public class CodeFilter implements Filter{

	public void destroy() {
		
	}
	
	private String code="UTF-8";
	
	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		//获得请求方式
		if(request.getMethod().equalsIgnoreCase("post")){
			request.setCharacterEncoding(code);
			res.setCharacterEncoding(code);
			chain.doFilter(request, res);
		}else if(request.getMethod().equalsIgnoreCase("get")){
			 res.setCharacterEncoding(code);
			 chain.doFilter(new EncodingParam(request),res);
		}else{
			chain.doFilter(request, res);
		}
		
	}
	
	public void init(FilterConfig conf) throws ServletException {
		//判断web.xml中是否已设置的编码方式
		String oldEncode = conf.getInitParameter("encode");
		if(oldEncode!=null&&!oldEncode.equals("")){
			code = oldEncode;
		}
		
	}

}
class EncodingParam extends HttpServletRequestWrapper{

	public EncodingParam(HttpServletRequest request) {
		super(request);
	}
	
	public String getParameter(String name) {
		
		if(this.getMethod().equalsIgnoreCase("get")){
			
			try {
				//获得之前的用户名
				String oldName = this.getRequest().getParameter(name);
				if(oldName!=null){
					String newName = new String(oldName.getBytes("iso-8859-1"),"UTF-8");
					return newName;
				}
								
				
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return super.getParameter(name);
		
	}
}
