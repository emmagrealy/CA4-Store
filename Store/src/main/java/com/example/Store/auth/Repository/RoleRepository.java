
package com.example.Store.auth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Store.auth.model.Positions;

public interface RoleRepository extends JpaRepository<Positions, Long>{
}
