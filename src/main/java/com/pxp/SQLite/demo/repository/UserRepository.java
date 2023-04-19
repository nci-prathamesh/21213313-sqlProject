package com.pxp.SQLite.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pxp.SQLite.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUserIdAndPassword(String userid, String password);
	User findByUserId(String userId);
}
