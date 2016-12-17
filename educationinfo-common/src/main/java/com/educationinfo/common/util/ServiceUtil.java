/**
 * 
 */
package com.educationinfo.common.util;

import org.apache.commons.lang3.StringUtils;

import com.educationinfo.common.dto.UserDto;

/**
 * @author Admin
 *
 */
public class ServiceUtil {

	/**
	 * validateUser
	 * 
	 * @param userDto
	 * @return
	 */
	public static boolean validateUser(UserDto userDto) {
		boolean isValid = false;
		if (userDto != null && StringUtils.isNotEmpty(userDto.getName()) && StringUtils.isNotEmpty(userDto.getUserName())
				&& StringUtils.isNotEmpty(userDto.getPassword())) {
			isValid = true;
		}
		return isValid;
	}

}
