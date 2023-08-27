package com.ems.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ems.dao.UserDao;
import com.ems.dto.Employee;
import com.ems.dto.ImageDto;
import com.ems.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDao();
	
	@Override
	public List<Employee> getDetailsByUserId(Integer userid) {
		return userDao.getDetailsByUserId(userid);
	}

	@Override
	public String uploadImageInfo(ImageDto image) {
		return userDao.uploadImageInfo(image);
	}

	@Override
	public ImageDto getProfileImage(Integer employeeId) {
		return userDao.getProfile(employeeId);
	}

}
