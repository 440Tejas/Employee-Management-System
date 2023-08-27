package com.ems.service;

import java.util.List;

import com.ems.dto.Country;
import com.ems.dto.Department;
import com.ems.dto.Employee;
import com.ems.dto.Job;
import com.ems.dto.Location;
import com.ems.dto.Region;
import com.ems.dto.UserRegisterDto;

public interface EmployeService {

	List<Employee> getAllEmployeeDetails();
	
	Integer getEmployeeCount();

	List<UserRegisterDto> getAdminData();

	List<UserRegisterDto> getUsersData();

	List<Department> getDepartment();

	List<Location> getAllLocationDetails();

	List<Job> getAllJobDetails();

	List<Region> getAllRegionDetails();

	List<Country> getCountryDetails();

	String saveEmployeeInfo(Employee emp);
	
	List<Employee> getManagers();

}
