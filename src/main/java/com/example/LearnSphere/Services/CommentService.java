package com.example.LearnSphere.Services;

import java.util.List;

import com.example.LearnSphere.Entity.Comments;

public interface CommentService {
	
	List<Comments> commentsList();
	
	String addComment(Comments c);

}
