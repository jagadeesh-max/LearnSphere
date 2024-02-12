package com.example.LearnSphere.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LearnSphere.Entity.Comments;
import com.example.LearnSphere.Repository.CommentRepository;

@Service
public class CommentServicesImp implements CommentService {
	
	@Autowired
	
	CommentRepository cmr;

	@Override
	public List<Comments> commentsList() {
		
		return cmr.findAll();
	}

	@Override
	public String addComment(Comments c) {
		cmr.save(c);
		return "comment is added";
	} 
	
	

	
}

