package com.example.demo.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@Service("employeeService")
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeeDao.save(employee);
	}

	@Override
	public List<Employee> getAllEmployeeDetailsById(String employeeId) {
		
		 return employeeDao.getAllEmployeeDetailsById(employeeId);
	}

}
