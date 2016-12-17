/**
 * 
 */
package com.educationinfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educationinfo.common.dto.UserDto;
import com.educationinfo.common.util.CopyUtils;
import com.educationinfo.common.util.DateUtil;
import com.educationinfo.common.util.ServiceUtil;
import com.educationinfo.dataaccess.beans.UserBean;
import com.educationinfo.dataaccess.dao.IUserDao;
import com.educationinfo.service.IUserService;

/**
 * @author Admin
 *
 */
@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDao userDao;
	
	@Override
	public UserDto getUserById(long userId){
		UserBean userBean = userDao.getUserById(userId);
		UserDto userDto = new UserDto();
		CopyUtils.copy(userBean, userDto);
		return userDto;
	}

	@Override
	public boolean login(UserDto userDto) {
		boolean status = false;
		UserBean userBean = userDao.getUser(userDto);
		if (userBean != null && userBean.getId() > 0) {
			status = true;
		}
		return status;
	}

	@Override
	public String saveUser(UserDto userDto) {
		String status = "Registration Failed..!";
		if (ServiceUtil.validateUser(userDto)) {
			UserBean userBean = userDao.getUserByUser(userDto.getUserName());
			if (userBean != null && userBean.getId() > 0) {
				status = "User already exist!";
			} else {
				CopyUtils.copy(userDto, userBean);
				userBean.setCreatedDate(DateUtil.getDate());
				userBean.setUpdatedDate(DateUtil.getDate());
				userBean = userDao.saveOrUpdateUser(userBean);
				status = "Registered Successfully...";
			}			
		}
		return status;
	}
}
