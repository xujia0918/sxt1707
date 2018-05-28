package Test.cn.sxt.shop.service.impl;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import cn.sxt.shop.entity.Dinnertable;
import cn.sxt.shop.service.DinnerTableService;
import cn.sxt.shop.service.impl.DinnerTableServiceimpl;

public class DinnerTableServiceTest {

	/**
	 * 单元Junit 测试使用步骤:
	 * 	1.导入Junit.jar  
	 *  2.写一个void 类型无参的方法。
	 *  3.在方法上面打上一个@Test注解
	 *  
	 *
	 */
	DinnerTableService s = new DinnerTableServiceimpl();
	
	@Test
	public void getAll(){//测试查询所有的餐桌信息
		List<Dinnertable> ts = s.getAll();
		if(ts!=null){
		for(Dinnertable t:ts){
			System.out.println(t.getTid()+"="+t.getTname()+"="+t.getTstatus()+"="+t.getOrderdate());
		}}
	}
	@Test
	public void deleteById(){
		int i = s.deleteById(12);
		if(i>0){
			System.out.println("删除成功");
		}
	}
	@Test
	public void editDinnerTable(){
		Dinnertable t = new Dinnertable(4,"西班牙",1,new Date());
		int i = s.editDinnerTable(t);
		if(i>0){
			System.out.println("修改成功");
		}
	}
	@Test
	public void addDinnerTable(){
		Dinnertable t = new Dinnertable("伦敦",1,new Date());
		boolean bool = s.addDinnerTable(t);
		if(bool){
			System.out.println("添加成功");
		}
	}
}
