package com.example.app.data.repositories;

import com.example.app.data.dao.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    List<User> findAllByEmail(String email);
    List<User> findAllByEmailAndPassword(String email, String password);
}
