package com.example.LearnSphere.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LearnSphere.Entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}
