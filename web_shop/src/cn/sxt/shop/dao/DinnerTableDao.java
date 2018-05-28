package cn.sxt.shop.dao;

import java.util.List;

import cn.sxt.shop.entity.Dinnertable;

/**
 * 餐桌的DAO接口
 *
 */
public interface DinnerTableDao {
	/**
	 * 获得所有餐桌信息
	 * @return 餐桌信息list
	 */
	public List<Dinnertable> getAll();
	/**
	 * 根据餐桌id删除餐桌
	 * @param 餐桌id
	 * @return 受影响行数
	 */
	public int deleteById(int id);
	/**
	 * 修改餐桌信息
	 * @param 餐桌对象
	 * @return 受影响行数
	 */
	public int editDinnerTable(Dinnertable t);
	/**
	 * 添加餐桌
	 * @param 餐桌对象
	 * @return 添加成功或失败true/false
	 */
	public boolean addDinnerTable(Dinnertable t);
}
