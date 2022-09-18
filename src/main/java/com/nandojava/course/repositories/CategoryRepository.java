package com.nandojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandojava.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
