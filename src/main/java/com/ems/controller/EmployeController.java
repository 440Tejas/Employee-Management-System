package com.ems.controller;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ems.dto.Employee;
import com.ems.service.EmployeService;
import com.ems.serviceImpl.EmployeServiceImpl;

@Component
public class EmployeController {
	
	private EmployeService employeService = new EmployeServiceImpl();
	
	@RequestMapping(value="getEmployee")
	public List<Employee> getAllEmployeeDetails(){
		List<Employee> list = employeService.getAllEmployeeDetails();
		for(Employee e: list){
			System.out.println(e.toString());
		}
		return list;
	}
	
	@RequestMapping(value="getCount")
	@ResponseBody
	public Integer getEmployeeCount() {
		return employeService.getEmployeeCount();
	}

}
