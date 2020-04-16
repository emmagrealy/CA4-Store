package com.example.Store.auth.services;

import com.example.Store.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}