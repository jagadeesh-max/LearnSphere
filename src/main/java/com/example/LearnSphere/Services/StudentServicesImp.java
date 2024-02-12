package com.example.LearnSphere.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LearnSphere.Entity.Lesson;
import com.example.LearnSphere.Repository.LessonRepository;

@Service
public class StudentServicesImp implements StudentServices {
	
	@Autowired
	
	LessonRepository lr;
	

	@Override
	public Lesson getLessons(int lessonId) {
		
		return lr.findById(lessonId).get();
	}

}
