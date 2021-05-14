package com.example.app.model;

import com.example.app.data.dto.Role;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;


public class User {
    UUID id;
    String email;
    String firstName;
    String lastName;
    String password;
    Collection<Role> roles;

    public com.example.app.data.dto.User transformToDto() {
        var userDTO = new com.example.app.data.dto.User();
        userDTO.setEmail(email);
        userDTO.setFirstName(firstName);
        userDTO.setLastName(lastName);
        userDTO.setPassword(password);
        userDTO.setRoles(roles);

        return userDTO;
    }

    public User(com.example.app.data.dto.User user) {
        email = user.getEmail();
        firstName = user.getFirstName();
        lastName = user.getLastName();
        password = user.getLastName();
        roles = user.getRoles();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }
}
