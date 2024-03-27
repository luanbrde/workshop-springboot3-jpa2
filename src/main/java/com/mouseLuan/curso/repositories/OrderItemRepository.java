package com.mouseLuan.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mouseLuan.curso.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
