package com.mouseLuan.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouseLuan.curso.entities.Category;
import com.mouseLuan.curso.entities.Order;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
