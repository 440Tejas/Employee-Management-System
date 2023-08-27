package com.ems.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ems.dto.Country;
import com.ems.dto.Department;
import com.ems.dto.Employee;
import com.ems.dto.Job;
import com.ems.dto.Location;
import com.ems.dto.UserRegisterDto;
import com.ems.service.EmployeService;
import com.ems.service.TransationServiceI;
import com.ems.serviceImpl.EmployeServiceImpl;
import com.ems.serviceImpl.transationServiceImpl;


@Controller
public class TranctionsController {

	private EmployeService employeService = new EmployeServiceImpl();

	private TransationServiceI transationService =new transationServiceImpl();
	
	@PostMapping("addRegion")
	public ModelAndView addRegionData(@RequestParam String name,Model model,HttpSession session,RedirectAttributes red) {
		UserRegisterDto user = (UserRegisterDto) session.getAttribute("user");
		if (user != null) {	
			String status = transationService.saveRegion(name);
			red.addFlashAttribute("feature", "Adding New Region");
			red.addFlashAttribute("status", status);
			return new ModelAndView("redirect:/adminurl");
		}
		return new ModelAndView("redirect:/error");
	}
	
	@PostMapping("addCountry")
	public ModelAndView addCountryData(@ModelAttribute Country country ,Model model,RedirectAttributes red,HttpSession session) {
		UserRegisterDto user = (UserRegisterDto) session.getAttribute("user");
		if (user != null) {
			String status = transationService.addCountaddCountryry(country);
			red.addFlashAttribute("feature", "Adding New Country Info");
			red.addFlashAttribute("status", status);
			return new ModelAndView("redirect:/adminurl");
		}
		return new ModelAndView("redirect:/error");
	}


	@PostMapping("addLocation")
	public ModelAndView addLocation(@ModelAttribute Location location, Model model,RedirectAttributes red,HttpSession session) {
		UserRegisterDto user = (UserRegisterDto) session.getAttribute("user");
		if (user != null) {
			String status = transationService.addLocationation(location);
			red.addFlashAttribute("feature", "Adding New Location");
			red.addFlashAttribute("status", status);
			return new ModelAndView("redirect:/adminurl");
		}
		return new ModelAndView("redirect:/error");
	}

	@PostMapping("addJob")
	public ModelAndView addJob(String name,String minSalary,String maxSalary, Model model,RedirectAttributes red,HttpSession session) {
		UserRegisterDto user = (UserRegisterDto) session.getAttribute("user");
		if (user != null) {	
			Job job  = new Job();
			job.setJobTitle(name);
			job.setMinSalary(Double.parseDouble(minSalary));
			job.setMaxSalary(Double.parseDouble(maxSalary));
			String status = transationService.addLocationation(job);
			red.addFlashAttribute("feature", "Adding New Job Info");
			red.addFlashAttribute("status", status);
			return new ModelAndView("redirect:/adminurl");
		}
		return new ModelAndView("redirect:/error");
	}
	
	@PostMapping("addDepartment")
	public ModelAndView addDepartment(@ModelAttribute Department dept,Model model,RedirectAttributes red,HttpSession session) {
		UserRegisterDto user = (UserRegisterDto) session.getAttribute("user");
		if (user != null) {
			String status = transationService.addDepartment(dept);
			red.addFlashAttribute("feature", "Adding New Department");
			red.addFlashAttribute("status", status);
			return new ModelAndView("redirect:/adminurl");
		}
		return new ModelAndView("redirect:/error");
	}
	
	@PostMapping("newEmployee")
	public ModelAndView addEmployee(@ModelAttribute Employee emp,RedirectAttributes red,HttpSession session) {
		UserRegisterDto user = (UserRegisterDto) session.getAttribute("user");
		if (user != null) {
			System.out.println(emp.toString());
			String status = employeService.saveEmployeeInfo(emp);
			red.addFlashAttribute("feature", "Adding New Employee");
			red.addFlashAttribute("status", status);
			return new ModelAndView("redirect:/adminurl");
		}
		return new ModelAndView("redirect:/error");
	}
	
	@GetMapping("deleteRegion")
	public ModelAndView deleteRegion(@RequestParam("regionId") Integer regionId,HttpSession session,RedirectAttributes red) {
		UserRegisterDto user = (UserRegisterDto) session.getAttribute("user");
		if (user != null) {
			String status = transationService.deleteRegionById(regionId);
			red.addFlashAttribute("feature", "Deleting Region");
			red.addFlashAttribute("status", status);
			return new ModelAndView("redirect:/adminurl");
		}
		return new ModelAndView("redirect:/error");
	}
	
	@GetMapping("deleteLocation")
	public ModelAndView deleteLocation(@RequestParam("locationId") Integer locationId,HttpSession session,RedirectAttributes red) {
		UserRegisterDto user = (UserRegisterDto) session.getAttribute("user");
		if (user != null) {
			String status = transationService.deleteLocationById(locationId);
			red.addFlashAttribute("feature", "Deleting Location");
			red.addFlashAttribute("status", status);
			return new ModelAndView("redirect:/adminurl");
		}
		return new ModelAndView("redirect:/error");
	}
	
	@GetMapping("deleteCountry")
	public ModelAndView deleteCountry(@RequestParam("countryId") String countryId,HttpSession session,RedirectAttributes red) {
		UserRegisterDto user = (UserRegisterDto) session.getAttribute("user");
		if (user != null) {
			String status = transationService.deleteCountryById(countryId);
			red.addFlashAttribute("feature", "Deleting Country");
			red.addFlashAttribute("status", status);
			return new ModelAndView("redirect:/adminurl");
		}
		return new ModelAndView("redirect:/error");
	}
	
	@GetMapping("deletejob")
	public ModelAndView deletejob(@RequestParam("jobId") Integer jobId,HttpSession session,RedirectAttributes red) {
		UserRegisterDto user = (UserRegisterDto) session.getAttribute("user");
		if (user != null) {
			String status = transationService.deleteJobById(jobId);
			red.addFlashAttribute("feature", "Deleting Job");
			red.addFlashAttribute("status", status);
			return new ModelAndView("redirect:/adminurl");
		}
		return new ModelAndView("redirect:/error");
	}
	
	@GetMapping("deleteDept")
	public ModelAndView deleteDepartment(@RequestParam("deptId") Integer deptId,HttpSession session,RedirectAttributes red) {
		UserRegisterDto user = (UserRegisterDto) session.getAttribute("user");
		if (user != null) {
			String status = transationService.deleteDeptById(deptId);
			red.addFlashAttribute("feature", "Deleting Department");
			red.addFlashAttribute("status", status);
			return new ModelAndView("redirect:/adminurl");
		}
		return new ModelAndView("redirect:/error");
	}
	
	@GetMapping("getRegionById")
	public ResponseEntity<String> getRegionById(@RequestParam Integer regionId) {
		String name =  transationService.getRegionById(regionId);
		System.out.println("Region : "+name);
		return ResponseEntity.ok(name);

	}
	
	@GetMapping("getCountryById")
	public @ResponseBody Country getCountryById(@RequestParam String countryId) {
		return transationService.getCountryById(countryId);
	}
	
	@GetMapping("getLocationById")
	public @ResponseBody Location getLocationById(@RequestParam Integer locationId) {
		return transationService.getLocationById(locationId);
	}
	
	@GetMapping("getDepartmentById")
	public @ResponseBody Department getDepartmentById(@RequestParam Integer deptId) {
		return transationService.getDepartmentById(deptId);
	}
	
	@GetMapping("getRegion")
	public @ResponseBody Job getJobById(@RequestParam Integer jobId) {
		return transationService.getJobById(jobId);
	}
	
	
	

}
