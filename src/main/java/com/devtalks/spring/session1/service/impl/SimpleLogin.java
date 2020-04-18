package com.devtalks.spring.session1.service.impl;

import org.springframework.stereotype.Component;

import com.devtalks.spring.session1.model.User;
import com.devtalks.spring.session1.service.Login;

@Component
public class SimpleLogin implements Login {

	@Override
	public User authenticate(String username, String password) {
		if ( username != null && password != null ) {
			if( username.equals(password)) {
				User user = new User();
				user.setUsername(username);
				user.setPassword(password);
				return user;
			}
		}
		return null;
	}

}
