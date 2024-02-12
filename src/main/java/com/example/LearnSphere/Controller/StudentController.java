package com.example.LearnSphere.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.LearnSphere.Entity.Lesson;
import com.example.LearnSphere.Services.StudentServices;

@Controller
public class StudentController {

	
	@Autowired
	StudentServices ss;
	
	@PostMapping("/getlesson")
	public String myLesson(@RequestParam("lessonId") int lessonId,Model model)
	{
		Lesson lesson=ss.getLessons(lessonId);
		model.addAttribute("lesson",lesson);
		return "mylessons";
	}
}
