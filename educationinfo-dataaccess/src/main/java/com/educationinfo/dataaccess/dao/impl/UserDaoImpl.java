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

import com.educationinfo.common.dto.UserDto;
import com.educationinfo.dataaccess.beans.UserBean;
import com.educationinfo.dataaccess.dao.IUserDao;

/**
 * @author Admin
 *
 */
@Repository
public class UserDaoImpl implements IUserDao{
	
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

	@Transactional
	public UserBean getUser(UserDto userDto) {
		UserBean userBean = new UserBean();
		try {
			Query query = entityManager.createNamedQuery("getUserByUserNameAndPwd");
			query.setParameter("userName", userDto.getUserName());
			query.setParameter("password", userDto.getPassword());
			userBean = (UserBean) query.getSingleResult();
		} catch (NoResultException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userBean;
	}

	@Transactional
	public UserBean saveOrUpdateUser(UserBean userBean) {
		try {
			userBean = entityManager.merge(userBean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userBean;
	}

	@Transactional
	public UserBean getUserByUser(String userName) {
		UserBean userBean = new UserBean();
		try {
			Query query = entityManager.createNamedQuery("getUserByUserName");
			query.setParameter("userName", userName);
			userBean = (UserBean) query.getSingleResult();
		} catch (NoResultException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userBean;
	}

}
