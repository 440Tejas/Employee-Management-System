package com.ems.service;



import java.util.HashMap;

import com.ems.dto.UserRegisterDto;

public interface LoginService {

	String registerUser(UserRegisterDto user);

	HashMap<String,Object> getUser(String name, String password);
	
}
