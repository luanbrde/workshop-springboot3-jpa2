package com.mouseLuan.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouseLuan.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
