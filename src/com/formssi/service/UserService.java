package com.formssi.service;

import com.formssi.entity.User;

public interface UserService {
	
	User getById(String id);

	void add(User user);
}
