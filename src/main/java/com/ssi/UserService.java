package com.ssi;

import org.springframework.stereotype.Service;

@Service
public class UserService {
	public boolean authenticateUser(User user) {
		if(user.getUserid().equals("abc") && user.getPassword().equals("xyz"))
			return true;
		else
			return false;
	}
}
