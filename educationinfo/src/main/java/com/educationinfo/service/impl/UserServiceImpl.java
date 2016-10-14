/**
 * 
 */
package com.educationinfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educationinfo.common.dto.UserDto;
import com.educationinfo.common.util.CopyUtils;
import com.educationinfo.dataaccess.beans.UserBean;
import com.educationinfo.dataaccess.dao.UserDao;
import com.educationinfo.service.UserService;

/**
 * @author Admin
 *
 */
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDto getUserById(long userId){
		UserBean userBean = userDao.getUserById(userId);
		UserDto userDto = new UserDto();
		CopyUtils.copy(userBean, userDto);
		return userDto;
	}
}
