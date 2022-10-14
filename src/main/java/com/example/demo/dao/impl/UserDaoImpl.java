package com.example.demo.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import com.example.demo.admin.model.User;
import com.example.demo.dao.AbstractDao;
import com.example.demo.dao.EmployeeDao;
import com.example.demo.dao.UserDao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends AbstractDao implements UserDao{

	final Logger log = (Logger) LoggerFactory.getLogger(UserDaoImpl.class);
	
	@Override
	public User findByUsername(String username) {
		User user = null;
		try {
			Criteria crit = getSession().createCriteria(User.class).add(Restrictions.eq("username", username));
//			user = new ArrayList<>();
//			user = crit.list();
			user = new User();
			user = (User) crit.uniqueResult();
		} catch (Exception e) {
			log.error("Exception in getClientsByUserIdAndStatus() of ClientRegistrationDaoImpl class ");
		}
		log.debug("End in getClientsByUserIdAndStatus() of ClientRegistrationDaoImpl class ");
		return user;
	}

}
