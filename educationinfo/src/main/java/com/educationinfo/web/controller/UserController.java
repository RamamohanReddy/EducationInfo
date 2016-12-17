/**
 * 
 */
package com.educationinfo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.educationinfo.common.dto.UserDto;
import com.educationinfo.common.util.GsonUtil;
import com.educationinfo.service.IUserService;

/**
 * @author Admin
 *
 */
@Controller
public class UserController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="getUserById",method=RequestMethod.GET)
	@ResponseBody
	public String getUserById(@RequestParam("userId") long userId){
		System.out.println("getUserById Start..");
		UserDto userDto = userService.getUserById(userId);
		return GsonUtil.toJson(userDto);
	}
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String login(Model model){
		System.out.println("login Start..");
		UserDto userDto = new UserDto();
		model.addAttribute("user",userDto);
		model.addAttribute("message","");
		System.out.println("login END..");
		return "login";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(@ModelAttribute("user") UserDto userDto,Model model){
		System.out.println("login POST Start..");
		System.out.println("userDto :: "+userDto);
		boolean status = userService.login(userDto);
		String page = "login";
		String message = "Login failed. Invalid Username/Password...";
		if (status) {
			page = "home";
			message = "Welcome "+userDto.getUserName();
		}
		model.addAttribute("message",message);
		System.out.println("login POST Start..");
		return page;
	}
	
	@RequestMapping(value="register",method=RequestMethod.GET)
	public String register(Model model){
		System.out.println("register Start..");
		UserDto userDto = new UserDto();
		model.addAttribute("user",userDto);
		System.out.println("register END..");
		return "register";
	}
	
	@RequestMapping(value="register",method=RequestMethod.POST)
	public String register(@ModelAttribute("user") UserDto userDto, Model model){
		System.out.println("register POST Start..");
		System.out.println("userDto :: "+userDto);
		String status = userService.saveUser(userDto);
		String page = "register";
		model.addAttribute("message",status);
		System.out.println("register POST Start..");
		return page;
	}
	
	@RequestMapping(value="logout",method=RequestMethod.GET)
	public String logout(Model model){
		System.out.println("login Start..");
		UserDto userDto = new UserDto();
		model.addAttribute("user",userDto);
		model.addAttribute("message","");
		System.out.println("login END..");
		return "login";
	}
}
