package com.example.LearnSphere.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LearnSphere.Entity.Users;

public interface UserRepository extends JpaRepository<Users,Integer>{
	
	boolean existsByEmail(String email);
	
	Users getByEmail(String email);

}
