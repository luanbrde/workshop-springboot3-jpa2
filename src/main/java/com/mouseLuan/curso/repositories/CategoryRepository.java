package com.mouseLuan.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouseLuan.curso.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
