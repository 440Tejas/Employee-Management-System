package com.ems.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ems.dao.DetailsDao;
import com.ems.dao.EmployeDao;
import com.ems.dto.Country;
import com.ems.dto.Department;
import com.ems.dto.Employee;
import com.ems.dto.Job;
import com.ems.dto.Location;
import com.ems.dto.Region;
import com.ems.dto.UserRegisterDto;
import com.ems.service.EmployeService;

@Service
public class EmployeServiceImpl implements EmployeService {
	
	private EmployeDao dao = new EmployeDao();
	
	private DetailsDao emp = new DetailsDao();

	@Override
	public List<Employee> getAllEmployeeDetails() {
		return dao.getAllEmployeeDetails();
	}

	@Override
	public Integer getEmployeeCount() {
		return dao.getEmployeeCount();
	}

	@Override
	public List<UserRegisterDto> getAdminData() {
		return dao.getAdminData();
	}

	@Override
	public List<UserRegisterDto> getUsersData() {
		return dao.getUsersData();
	}

	@Override
	public List<Department> getDepartment() {
		return dao.getDepartmentDetails();
	}

	@Override
	public List<Location> getAllLocationDetails() {
		return emp.getAllLocationDetails();
	}

	@Override
	public List<Job> getAllJobDetails() {
		return emp.getAllJobDetails();
	}

	@Override
	public List<Region> getAllRegionDetails() {
		return emp.getAllRegionDetails();
	}

	@Override
	public List<Country> getCountryDetails() {
		return emp.getCountryDetails();
	}

	@Override
	public String saveEmployeeInfo(Employee em) {
		return emp.saveInfoEmployee(em);
	}

	@Override
	public List<Employee> getManagers() {
		return dao.getManagers();
	}
	
	

}
