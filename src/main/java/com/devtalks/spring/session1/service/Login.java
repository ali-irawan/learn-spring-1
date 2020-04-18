package com.devtalks.spring.session1.service;

import com.devtalks.spring.session1.model.User;

public interface Login {
	
	public User authenticate (String username, String password);
	
}
