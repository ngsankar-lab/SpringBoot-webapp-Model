# SpringBoot-webapp-Model
Spring Boot webapp with Model

What is it?
----------
Spring boot app using ModelAndView
passing an object to home method, and addboject to ModelAndView

public ModelAndView Home(Person person)
ModelAndView mv=new ModelAndView();
		mv.addObject("obj",person);
		mv.setViewName("home");
		return mv;
