package cn.sxt.shop.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.sxt.shop.dao.DinnerTableDao;
import cn.sxt.shop.entity.Dinnertable;
import cn.sxt.shop.utils.ComPoolUtil;
/**
 * 餐桌接口的实现类    DAO实现层与数据库连接
 *
 */
public class DinnerTableDaoImpl implements DinnerTableDao{

	public List<Dinnertable> getAll() {
		List<Dinnertable> list = null;
		try {
			list = ComPoolUtil.getQueryRunner().query("select * from dinnertable", new BeanListHandler<Dinnertable>(Dinnertable.class));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public int deleteById(int id) {
		int row = 0;
		try {
			row = ComPoolUtil.getQueryRunner().update("delete from dinnertable where tid=?", id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}

	public int editDinnerTable(Dinnertable t) {
		int row = 0;
		String sql = "update dinnertable set tname=?,tstatus=?,orderdate=? where tid=?";
		try {
			row = ComPoolUtil.getQueryRunner().update(sql,t.getTname(),t.getTstatus(),t.getOrderdate(),t.getTid());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;
	}

	public boolean addDinnerTable(Dinnertable t) {
		int row = 0;
		String sql = "INSERT INTO dinnertable(tname,tstatus,orderdate) VALUES(?,?,?)";
		try {
			row = ComPoolUtil.getQueryRunner().update(sql,t.getTname(),t.getTstatus(),t.getOrderdate());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row>0?true:false;
	}

}
