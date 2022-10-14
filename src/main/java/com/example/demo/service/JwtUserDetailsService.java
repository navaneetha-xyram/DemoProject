//package com.example.demo.service;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.example.demo.dao.UserDao;
//import com.example.demo.enumType.UserStatus;
//
//@Service
//@Transactional
//public class JwtUserDetailsService implements UserDetailsService {
//
//	@Autowired
//	private UserDao userDao;
//
//	private static Map<String, com.example.demo.admin.model.Users> userCache = new HashMap<>();
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//		com.example.demo.admin.model.Users user = null;
//
//		List<com.example.demo.admin.model.Users> users = userDao.findByUsername(username);
//		if (users != null && users.size() > 0) {
//			user = users.get(0);
//		}
//
//		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//		grantedAuthorities.add(new SimpleGrantedAuthority("ROLE_" + user.getUserRole()));
//
//		System.out.println(user.getStatus());
//		if (user.getStatus() == UserStatus.ACTIVE) {
//
//			return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
//		}
//
//		else {
//			return new User(user.getUsername(), user.getPassword(), false, true, true, true, grantedAuthorities);
//		}
//
//	}
////		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User Not Found for the username: " + username);
////		return new User(username, user.getPassword(), new ArrayList<>());
//
//	public com.example.demo.admin.model.Users getAppUser(String username) {
//
//		com.example.demo.admin.model.Users user = null;
//
//		List<com.example.demo.admin.model.Users> users = userDao.findByUsername(username);
//		if (users != null && users.size() > 0) {
//			user = users.get(0);
//		}
//
//		user.setPassword(null);
//		return user;
//	}
//
//}
