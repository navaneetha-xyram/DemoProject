package com.example.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.demo.admin.model.User;
import com.example.demo.dao.AbstractDao;
import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

@Repository
public class EmployeeDaoImpl extends AbstractDao implements EmployeeDao{

	 private final Logger log = (Logger) LoggerFactory.getLogger(EmployeeDaoImpl.class);
	 
	Session session = null;
	
	@Override
	public Employee save(Employee employee) {
		
	    try {
	      session = getSession();
	      session.save(employee);
	    } catch (Exception e) {
	      log.error("Exception in save() of EmployeeDaoImpl class ");
	    }
	    return employee;
	}

	@Override
	public List<Employee> getAllEmployeeDetailsById(String employeeId) {
		log.debug("Start in getList() of AuthTempDaoImpl class ");
		List<Employee> emp = null;
		try {
			Criteria crit = getSession().createCriteria(Employee.class).add(Restrictions.eq("employeeId", employeeId));
			emp = new ArrayList<>();
			emp = crit.list();
		} catch (Exception e) {
			log.error("Exception in getClientsByUserIdAndStatus() of ClientRegistrationDaoImpl class ");
		}
		log.debug("End in getClientsByUserIdAndStatus() of ClientRegistrationDaoImpl class ");
		return emp;

	}
	
	

}
