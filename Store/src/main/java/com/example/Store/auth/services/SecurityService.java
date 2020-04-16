package com.example.Store.auth.services;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}