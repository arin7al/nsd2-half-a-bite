package com.example.app.data.dto;

import com.example.app.data.dao.Role;
import lombok.Getter;

import java.util.Collection;
import java.util.UUID;

@Getter
public class UserDto {
    String email;
    String firstName;
    String lastName;
    String password;

    public com.example.app.data.dao.User transformToDao() {
        var userDTO = new com.example.app.data.dao.User();
        userDTO.setEmail(email);
        userDTO.setFirstName(firstName);
        userDTO.setLastName(lastName);
        userDTO.setPassword(password);
        return userDTO;
    }

    public UserDto(com.example.app.data.dao.User user) {
        email = user.getEmail();
        firstName = user.getFirstName();
        lastName = user.getLastName();
        password = user.getLastName();
    }
}
