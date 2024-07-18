package com.lenncoder.service;

import com.lenncoder.entity.User;

public interface UserService {

	public User saveUser(User user);
	
	public boolean existEmailCheck(String email);
	
}
