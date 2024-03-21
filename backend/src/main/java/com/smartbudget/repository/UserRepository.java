package com.smartbudget.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smartbudget.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
