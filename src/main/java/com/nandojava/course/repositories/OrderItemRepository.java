package com.nandojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandojava.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{	
	
}
