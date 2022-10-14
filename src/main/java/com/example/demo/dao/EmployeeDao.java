package com.example.demo.dao;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeDao {

	Employee save(Employee employee);

	List<Employee> getAllEmployeeDetailsById(String employeeId);

}
