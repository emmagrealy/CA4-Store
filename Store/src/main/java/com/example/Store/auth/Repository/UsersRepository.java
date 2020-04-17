package com.example.Store.auth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Store.auth.model.Customer;

public interface UsersRepository extends JpaRepository<Customer, Long> {
    Customer findByUsername(String username);
}
