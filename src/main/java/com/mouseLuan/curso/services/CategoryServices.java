package com.mouseLuan.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouseLuan.curso.entities.Category;
import com.mouseLuan.curso.repositories.CategoryRepository;

@Service
public class CategoryServices {

	@Autowired
	public CategoryRepository userRepository;

	public List<Category> findAll() {

		return userRepository.findAll();

	}

	public Category findById(Long id) {
		Optional<Category> obj = userRepository.findById(id);
		return obj.get();

	}

}
