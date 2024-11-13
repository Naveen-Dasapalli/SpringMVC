package com.SpringMVC.ORM.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVC.ORM.Model.User;
import com.SpringMVC.ORM.Repository.UserDAOImpl;

@Service
public class UserService {
	
	@Autowired
	private UserDAOImpl userDAOImpl;
	
	public int CreateUser(User user) {
		return userDAOImpl.saveUser(user);
	}

}
