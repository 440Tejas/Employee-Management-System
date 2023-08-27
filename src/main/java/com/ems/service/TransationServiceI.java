package com.ems.service;

import org.springframework.stereotype.Service;

import com.ems.dto.Country;
import com.ems.dto.Department;
import com.ems.dto.Job;
import com.ems.dto.Location;

@Service
public interface TransationServiceI {

	String addCountaddCountryry(Country country);

	String addLocationation(Location location);

	String addLocationation(Job jOb);

	String saveRegion(String name);

	String addDepartment(Department dept);

	String deleteRegionById(Integer regionId);

	String deleteDeptById(Integer deptId);

	String deleteJobById(Integer jobId);

	String deleteCountryById(String countryId);

	String deleteLocationById(Integer locationId);

	String getRegionById(Integer regionId);

	Country getCountryById(String countryId);

	Location getLocationById(Integer locationId);

	Department getDepartmentById(Integer deptId);

	Job getJobById(Integer jobId);
}
