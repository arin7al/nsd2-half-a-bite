package com.example.app.service;

import com.example.app.data.repositories.UserRepository;
import com.example.app.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void create(User user) {
        userRepository.save(user.transformToDto());
    }

    public void getUser(UUID id) {
        userRepository.findById(id.toString());
    }

    public User getUser(String email) {
        var users = userRepository.findAllByEmail(email);
        if(users.isEmpty())
            return null;

        var userModel = new User(users.stream().findFirst().get());
        return userModel;
    }
}
