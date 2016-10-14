/**
 * 
 */
package com.educationinfo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.educationinfo.common.dto.UserDto;
import com.educationinfo.common.util.GsonUtil;
import com.educationinfo.service.UserService;

/**
 * @author Admin
 *
 */
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="getUserById",method=RequestMethod.GET)
	@ResponseBody
	public String getUserById(@RequestParam("userId") long userId){
		System.out.println("getUserById Start..");
		UserDto userDto = userService.getUserById(userId);
		return GsonUtil.toJson(userDto);
	}
}
