package com.example.Store.auth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Store.auth.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}