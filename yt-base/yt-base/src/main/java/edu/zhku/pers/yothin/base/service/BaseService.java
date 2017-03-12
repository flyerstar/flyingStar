package edu.zhku.pers.yothin.base.service;

import java.util.List;

@SuppressWarnings("rawtypes")
public interface BaseService {

	/*获取对象，need对象类，Id*/
	public Object getObject(Class paramClass, long paramId);

	/*获取对象列表，need对象类*/
	public List getAllObject(Class paramClass);

	/*添加对象，need对象实体，实体id应为null*/
	public void addObject(Object paramEntity);

	/*修改对象，need对象实体，实体id不为null*/
	public void modifyObject(Object paramEntity);

	/*添加或修改对象，need对象实体，实体id为null时add，实体id存在时modify*/
	public void addOrModifyObject(Object paramEntity);

	/*删除对象，need对象实体，实体不为null*/
	public void removeObject(Object paramEntity);

	/*删除对象，need对象类，Id*/
	public void removeObject(Class paramClass, long paraId);
}
