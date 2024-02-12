package com.example.LearnSphere.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.LearnSphere.Entity.Users;
import com.example.LearnSphere.Repository.UserRepository;

@Service
public class UserServicesImp implements UserServices {
	
	@Autowired
	UserRepository ur; 
	


	@Override
	public String addUser(Users user) {
		// TODO Auto-generated method stub
		ur.save(user);
		return "user added successfully";
	}



	@Override
	public boolean checkEmail(String email) {
		
		return ur.existsByEmail(email);
	}



	@Override
	public boolean valid(String email, String password) {
		
		if(ur.existsByEmail(email))
		{
			Users s=ur.getByEmail(email);
			String dbpass=s.getPassword();
			String dbrole=s.getRole();
			if(password.equals(dbpass))
			{
					return true; 
				
			}
			else
			{
				return false;
			}
			
		}
		else
		{
			return false;
		}

	}



	@Override
	public String getUserRole(String email) {
		
		Users u=ur.getByEmail(email);
		return u.getRole();
	}

}
