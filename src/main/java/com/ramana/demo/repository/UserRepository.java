package com.ramana.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramana.demo.entity.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
