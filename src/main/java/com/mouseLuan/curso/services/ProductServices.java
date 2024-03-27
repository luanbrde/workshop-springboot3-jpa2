package com.mouseLuan.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mouseLuan.curso.entities.Product;
import com.mouseLuan.curso.repositories.ProductRepository;

@Service
public class ProductServices {

	@Autowired
	public ProductRepository userRepository;

	public List<Product> findAll() {

		return userRepository.findAll();

	}

	public Product findById(Long id) {
		Optional<Product> obj = userRepository.findById(id);
		return obj.get();

	}

}
