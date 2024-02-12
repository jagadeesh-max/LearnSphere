package com.example.LearnSphere.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LearnSphere.Entity.Lesson;

public interface LessonRepository extends JpaRepository<Lesson, Integer>{

}
