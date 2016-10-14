/**
 * 
 */
package com.educationinfo.dataaccess.dao;

import com.educationinfo.dataaccess.beans.UserBean;

/**
 * @author Admin
 *
 */
public interface UserDao {

	UserBean getUserById(long userId);

}
