package edu.zhku.pers.yothin.base.dao;

import java.util.List;

@SuppressWarnings("rawtypes") 
public interface BaseDao {

	/*获取对象，need对象类，Id*/
	public Object get(Class paramClass,long paramId);
	
	/*获取对象列表，need对象类*/
	public List<Object> getAll(Class paramClass);
	
	/*保存对象，need对象实体，实体id应为null*/
	public void save(Object paramEntity);
	
	/*保存或更新对象，need对象实体，实体id为null时save，实体id存在时update*/
	public void saveOrUpdate(Object paramEntity);
	
	/*更新对象，need对象实体，实体id不为null*/
	public void update(Object paramEntity);
	
	/*删除对象，need对象类，Id*/
	public void delete(Class paramClass,long paramId);
	
	/*删除对象，need对象实体，实体id不为null*/
	public void delete(Object paramEntity);
	
}
