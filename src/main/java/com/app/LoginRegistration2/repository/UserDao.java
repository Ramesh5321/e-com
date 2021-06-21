package com.app.LoginRegistration2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.LoginRegistration2.entity.User;
@Repository
public interface UserDao extends JpaRepository<User,Integer> {
	User findByUsername(String username);
    User findByEmail(String email);
}

