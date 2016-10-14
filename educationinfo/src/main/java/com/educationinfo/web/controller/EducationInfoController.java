/**
 * 
 */
package com.educationinfo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Admin
 *
 */
@Controller
public class EducationInfoController {

	@RequestMapping(value="home",method=RequestMethod.GET)
	public String home(){
		System.out.println("Home page redirection");
		return "index";
	}
}
