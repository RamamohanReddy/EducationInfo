/**
 * 
 */
package com.educationinfo.dataaccess.dao;

import com.educationinfo.common.dto.UserDto;
import com.educationinfo.dataaccess.beans.UserBean;

/**
 * @author Admin
 *
 */
public interface IUserDao {

	UserBean getUserById(long userId);

	UserBean getUser(UserDto userDto);

	UserBean saveOrUpdateUser(UserBean userBean);

	UserBean getUserByUser(String userName);

}
