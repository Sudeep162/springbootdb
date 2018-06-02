package com.demo.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@Controller
public class DemoController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping("/login") 
	public String login() {
		return "Helllo";
	}
	
	@RequestMapping("/saveEmployee")
	public String saveEmployee() {
		
		Employee emp = new Employee();
		emp.setCompany("Verizon");
		emp.setUser("Sudeep");
		employeeService.saveEmployee(emp);
		
		return "Helllo";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
