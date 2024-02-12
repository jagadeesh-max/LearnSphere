package com.example.LearnSphere.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LearnSphere.Entity.Comments;

public interface CommentRepository extends JpaRepository<Comments, Integer>{

}
