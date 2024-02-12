package com.example.LearnSphere.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.LearnSphere.Services.CommentService;

@Controller
public class CommentController {
	
	@Autowired
	CommentService cms;
	

}
