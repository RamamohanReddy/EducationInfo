/**
 * 
 */
package com.educationinfo.dataaccess.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.educationinfo.dataaccess.beans.UserBean;
import com.educationinfo.dataaccess.dao.UserDao;

/**
 * @author Admin
 *
 */
@Repository
public class UserDaoImpl implements UserDao{
	
	@PersistenceContext
    private EntityManager entityManager;

	@Transactional
	public UserBean getUserById(long userId) {
		UserBean userBean = new UserBean();
		try {
			Query query = entityManager.createNamedQuery("getUserById");
			query.setParameter("id", userId);
			userBean = (UserBean) query.getSingleResult();
		} catch (NoResultException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userBean;
	}

}
