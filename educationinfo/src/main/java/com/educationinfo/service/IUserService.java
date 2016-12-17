package com.educationinfo.service;

import com.educationinfo.common.dto.UserDto;

public interface IUserService {

	UserDto getUserById(long userId);

	boolean login(UserDto userDto);

	String saveUser(UserDto userDto);

}
