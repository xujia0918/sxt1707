package cn.sxt.shop.service.impl;

import java.util.List;

import cn.sxt.shop.dao.DinnerTableDao;
import cn.sxt.shop.dao.impl.DinnerTableDaoImpl;
import cn.sxt.shop.entity.Dinnertable;
import cn.sxt.shop.service.DinnerTableService;

/**
 * 餐桌业务实现类
 * @author xujia
 *
 */
public class DinnerTableServiceimpl implements DinnerTableService{
	
	DinnerTableDao dao = new DinnerTableDaoImpl();
	
	public List<Dinnertable> getAll() {
		return dao.getAll();
	}

	public int deleteById(int id) {
		return dao.deleteById(id);
	}

	public int editDinnerTable(Dinnertable t) {
		return dao.editDinnerTable(t);
	}

	public boolean addDinnerTable(Dinnertable t) {
		return dao.addDinnerTable(t);
	}
	
}