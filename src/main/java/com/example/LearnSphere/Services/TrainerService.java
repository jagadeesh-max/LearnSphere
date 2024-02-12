package com.example.LearnSphere.Services;

import java.util.List;

import com.example.LearnSphere.Entity.Course;
import com.example.LearnSphere.Entity.Lesson;

public interface TrainerService {
	
	String addcourse(Course c);
	
	String addlesson(Lesson l);
	 
	Course getCourse(int cid); 
	
	List<Course> courseList();
	

}
