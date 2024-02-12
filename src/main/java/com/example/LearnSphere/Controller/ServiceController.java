package com.example.LearnSphere.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.LearnSphere.Entity.Comments;
import com.example.LearnSphere.Entity.Users;
import com.example.LearnSphere.Services.CommentService;
import com.example.LearnSphere.Services.UserServices;

import jakarta.servlet.annotation.HttpMethodConstraint;

@Controller
public class ServiceController {
	
	@Autowired
	UserServices us;
	
	@Autowired
	CommentService cms;
	
	@PostMapping("/adduser")
	public String addUser(@RequestParam("name")String name,
			@RequestParam("email")String email,
			@RequestParam("password")String pass,
			@RequestParam("role")String role)
	{
		boolean EmailExist=us.checkEmail(email);
		if(EmailExist==false)
		{
			Users user=new Users();
			user.setName(name);
			user.setEmail(email);
			user.setPassword(pass);
			user.setRole(role);
			us.addUser(user);
			
			System.out.println("registration successfull");
			return "redirect:/login";
		}
		else
		{
			System.out.println("email already present");
			return "redirect:/register";
		}
	     
	}
	
	@PostMapping("/validate")
	public String validate(@RequestParam("email")String email,
			@RequestParam("password")String password)
	{
		if(us.checkEmail(email))
		{
		if(us.valid(email, password))
		{
			if(us.getUserRole(email).equals("trainer"))
			{
				System.out.println("logged as trainer");
				return "redirect:/trainerhome";
			}
			else
			{
				System.out.println("logged as student");
				return "redirect:/studenthome";
			}
		}
		else
		{
			System.out.println("login failed ,try again");
			return "redirect:/login";
		}
		}
		else
		{
			System.out.println("email not present");
			return "redirect:/login";
		}
	}
	
	@PostMapping("/addcomment")
	public String addComment(@RequestParam("comment")String comment,Model model)
	{
		Comments c=new Comments();
		c.setComment(comment);
		cms.addComment(c);
		
		List<Comments> comlist=cms.commentsList();
		model.addAttribute("comments", comlist);
		return "redirect:/";
		
		
	}

}
