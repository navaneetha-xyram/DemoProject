package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.configuration.JwtTokenUtil;
import com.example.demo.entity.AuthRequest;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {

	private final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	JwtTokenUtil jwtTokenUtil;

	@PostMapping(value = { "/addEmployee" })
	public Employee addEmployee(@RequestBody Employee employee) {
		logger.info("received request to add employee");
		return employeeService.addEmployee(employee);
	}
	
	@GetMapping(value = {"/getAllEmployeeDetailsById/{employeeId}"})
	 public List<Employee> getEmployeeDetailsById(@PathVariable String employeeId) {
		 logger.info("received request to employeeDetails by id");
		 return employeeService.getAllEmployeeDetailsById(employeeId);
	 }

	@PostMapping("/authenticate")
	public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword()));
		} catch (Exception e) {
			throw new Exception("invalid user details");
		}
		return jwtTokenUtil.generateToken(authRequest.getUserName());
	}
}
