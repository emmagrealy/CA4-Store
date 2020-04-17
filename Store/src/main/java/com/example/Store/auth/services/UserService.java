package com.example.Store.auth.services;

import com.example.Store.auth.model.Customer;

public interface UserService {
    void save(Customer user);

    Customer findByUsername(String username);
}