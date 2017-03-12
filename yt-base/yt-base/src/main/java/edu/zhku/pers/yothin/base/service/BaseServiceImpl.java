package edu.zhku.pers.yothin.base.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import edu.zhku.pers.yothin.base.dao.BaseDao;

@SuppressWarnings("rawtypes")
@Service(value = "baseService")
public class BaseServiceImpl implements BaseService {

	@Resource(name = "baseDao")
	private BaseDao baseDao;

	public Object getObject(Class paramClass, long paramId) {
		return baseDao.get(paramClass, paramId);
	}

	public List getAllObject(Class paramClass) {
		return baseDao.getAll(paramClass);
	}

	public void addObject(Object paramEntity) {
		baseDao.save(paramEntity);
	}

	public void modifyObject(Object paramEntity) {
		baseDao.update(paramEntity);
	}

	public void addOrModifyObject(Object paramEntity) {
		baseDao.saveOrUpdate(paramEntity);
	}

	public void removeObject(Object paramEntity) {
		baseDao.delete(paramEntity);
	}

	public void removeObject(Class paramClass, long paramId) {
		baseDao.delete(paramClass, paramId);
	}

}
