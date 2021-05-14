package com.example.app.data.repositories;

import com.example.app.data.dto.Role;
import com.example.app.data.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
    Role findByName(String name);
}