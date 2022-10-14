package com.example.demo.dao;

import java.util.List;

import com.example.demo.admin.model.User;
import com.example.demo.entity.CurrentUser;


public interface UserDao {
	
	User findByUsername(String username);

}
