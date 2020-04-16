package com.example.Store.auth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Store.auth.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
}
