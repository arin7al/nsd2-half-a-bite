package com.example.app.service;

import com.example.app.data.dto.Login;
import com.example.app.data.repositories.UserRepository;
import com.example.app.data.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void create(UserDto user) {
        userRepository.save(user.transformToDao());
    }

    public void getUser(UUID id) {
        userRepository.findById(id.toString());
    }

    public UserDto getUser(String email) {
        var users = userRepository.findAllByEmail(email);
        if (users.isEmpty()) {
            return null;
        }
        var userModel = new UserDto(users.stream().findFirst().get());
        return userModel;
    }

    public boolean findIfCorrect(Login login) {
        var users = userRepository.findAllByEmailAndPassword(login.getEmail(), login.getPassword());
        return !users.isEmpty();
    }

    public List<com.example.app.data.dao.User> getAllUsers() {
        return userRepository.findAll();
    }
}
