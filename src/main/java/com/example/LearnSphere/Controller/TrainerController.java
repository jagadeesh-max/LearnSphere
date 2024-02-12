package com.example.LearnSphere.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.LearnSphere.Entity.Course;
import com.example.LearnSphere.Entity.Lesson;
import com.example.LearnSphere.Services.TrainerService;

@Controller
public class TrainerController {
	
	@Autowired
	TrainerService ts;
	
	
	@PostMapping("/addcourse")
	public String addcourse(@RequestParam("courseId")int courseid,
	@RequestParam("courseName")String coursename,
	@RequestParam("coursePrice")int courseprice)
	{
		Course c=new Course();
		c.setCourseId(courseid);
		c.setCourseName(coursename);
		c.setCoursePrice(courseprice);
		
		ts.addcourse(c);
		
		return "redirect:/";
	}
	
	@PostMapping("/lesson")
	public String addlesson(@RequestParam("courseId")int courseid,
			@RequestParam("lessonId")int lessonid,
			@RequestParam("lessonName")String lessonname,
			@RequestParam("lessontopics")String lessontopics,
			@RequestParam("links")String links)
	{
	   Course c=ts.getCourse(courseid);
	   
	   Lesson lesson=new Lesson(lessonid, lessonname, lessontopics, links, c);
	   ts.addlesson(lesson);
	   c.getLesson().add(lesson);
	   
	   return "redirect:/";
	}
	
	@GetMapping("/showcourses")
	public String showCourses(Model model)
	{
		List<Course> courselist=ts.courseList();
		model.addAttribute("courselist",courselist);
		//System.out.println(c);
		return "Courses";
	}
	

}
