package com.mouseLuan.curso.services;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouseLuan.curso.entities.User;
import com.mouseLuan.curso.repositories.UserRepository;

@Service
public class UserServices {

	@Autowired
	public UserRepository userRepository;

	public List<User> findAll() {

		return userRepository.findAll();

	}

	public User findById(Long id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.get();

	}
	
	public User insert (User obj) {
		return userRepository.save(obj);
	}
	
	public void delete (Long id) {
		userRepository.deleteById(id);;
	}

}
