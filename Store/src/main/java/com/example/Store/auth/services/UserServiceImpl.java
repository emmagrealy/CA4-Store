package com.example.Store.auth.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.Store.auth.Repository.RoleRepository;
import com.example.Store.auth.Repository.UsersRepository;
import com.example.Store.auth.model.Customer;

import java.util.HashSet;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(Customer user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setPositions(new HashSet<>(roleRepository.findAll()));
        userRepository.save(user);
    }

    @Override
    public Customer findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}