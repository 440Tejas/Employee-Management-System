package com.ems.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.ems.dto.Employee;
import com.ems.dto.ImageDto;

public interface UserService {

	List<Employee> getDetailsByUserId(Integer userid);

	String uploadImageInfo(ImageDto image);

	ImageDto getProfileImage(Integer employeeId);

}
