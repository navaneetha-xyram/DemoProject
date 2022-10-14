package com.example.demo.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.apiResponse.ApiResponse;
import com.example.demo.entity.Employee;

public interface EmployeeService {

	Employee addEmployee(Employee employee);

	List<Employee> getAllEmployeeDetailsById(String employeeId);
	

}
