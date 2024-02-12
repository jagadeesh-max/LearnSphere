package com.example.LearnSphere.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	
	@GetMapping("/")
	public String Index()
	{
		return "index";
	}
	
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
	
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	
	@GetMapping("/addcourse")
	public String createcourse()
	{
		return "createcourse";
	}
	
	@GetMapping("/addlesson")
	public String addlesson()
	{
		return "addlesson";
	}
	@GetMapping("/studenthome")
	public String StudentHome()
	{
		return "StudentHome";
	}
	
	@GetMapping("/trainerhome")
	public String TrainerHome()
	{
		return "TrainerHome";
	}
	
	@GetMapping("/courses")
	public String Courses()
	{
		return "Courses";
	}
	
	@GetMapping("/mycourses")
	public String mycourses()
	{
		return "mycourses";
	}
	
	@GetMapping("/mypurchases")
	public String mypurchases()
	{
		return "purchase";
	}
	
	@GetMapping("/demolesson")
	public String demolesson()
	{
		return "demolesson";
	}
	
	

}
