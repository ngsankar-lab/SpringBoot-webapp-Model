package com.ngs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public ModelAndView Home(Person person) {
		System.out.println("Inside Home method");
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",person);
		mv.setViewName("home");
		return mv;
	}

}
