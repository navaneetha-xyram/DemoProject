package com.example.demo.admin.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.enumType.UserStatus;

@Entity
@Table(name = "users")
public class User {

	@Id
//	@IdPrefix(value = "USR_")
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@GenericGenerator(name = IdGenerator.ID_GENERATOR, strategy = "package com.example.demo.id.generator.IdGenerator")
	@Column(name = "user_id")
	private String id;

	@Column(name = "username", unique = true)
	private String username;

	@Column(name = "password")
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
