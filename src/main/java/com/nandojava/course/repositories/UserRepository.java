package com.nandojava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nandojava.course.entities.User1;

public interface UserRepository extends JpaRepository<User1, Long>{	
	
}
