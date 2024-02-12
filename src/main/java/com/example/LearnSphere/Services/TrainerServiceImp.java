package com.example.LearnSphere.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LearnSphere.Entity.Course;
import com.example.LearnSphere.Entity.Lesson;
import com.example.LearnSphere.Repository.LessonRepository;
import com.example.LearnSphere.Repository.CourseRepository;


@Service
public class TrainerServiceImp implements TrainerService{
	
	@Autowired
	CourseRepository cr;
	
	@Autowired
	LessonRepository lr;

	@Override
	public String addcourse(Course c) {
		
		cr.save(c);
		return "course added";
	}

	@Override
	public String addlesson(Lesson l) {
		
		lr.save(l);
		return "lessons added";
	}

	@Override
	public Course getCourse(int cid) {
		
		return cr.findById(cid).get();
		
	}

	@Override
	public List<Course> courseList() {
		
		return cr.findAll();
	}

}
