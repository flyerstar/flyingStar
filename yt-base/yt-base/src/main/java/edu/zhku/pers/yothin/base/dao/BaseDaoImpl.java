package edu.zhku.pers.yothin.base.dao;

import java.util.List;
import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import edu.zhku.pers.yothin.base.util.LogUtil;

@SuppressWarnings("rawtypes")
@Repository(value = "baseDao")
public class BaseDaoImpl implements BaseDao {

	@Resource(name = "sessionFactory")
	private SessionFactory sessionFactory;

	/* 获取当前session */
	protected final Session getCurrentSession() {
		if (sessionFactory == null) {
			try {
				throw new Exception("Session Create Fail,SessionFactory is null!");
			} catch (Exception e) {
				LogUtil.logException("BaseDaoImpl.getCurrentSession()", e);
				return null;
			}
		}
		return sessionFactory.getCurrentSession();
	}

	/* 创建一个新的session */
	protected final Session createNewSession() {
		if (sessionFactory == null) {
			try {
				throw new Exception("Session Create Fail,SessionFactory is null!");
			} catch (Exception e) {
				LogUtil.logException("BaseDaoImpl.createNewSession()", e);
				return null;
			}
		}
		return sessionFactory.openSession();
	}

	public final Object get(Class paramClass, long paramId) {
		return getCurrentSession().get(paramClass, Long.valueOf(paramId));
	}

	@SuppressWarnings("unchecked")
	public List<Object> getAll(Class paramClass) {
		return getCurrentSession().createQuery("from " + paramClass.getName()).list();
	}

	public void save(Object paramEntity) {
		getCurrentSession().save(paramEntity);
	}

	public void saveOrUpdate(Object paramEntity) {
		getCurrentSession().saveOrUpdate(paramEntity);
	}

	public void update(Object paramEntity) {
		getCurrentSession().update(paramEntity);
	}

	public void delete(Class paramClass, long paramId) {
		Object entity = get(paramClass, paramId);
		delete(entity);
	}

	public void delete(Object paramEntity) {
		getCurrentSession().delete(paramEntity);
	}

}
