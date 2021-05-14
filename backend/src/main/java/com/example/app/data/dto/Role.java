package com.example.app.data.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collection;

@Entity
@NoArgsConstructor
@Setter
public class Role {
    @Id
    private String name; //operator, emitent, investor
    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;

    @ManyToMany
    @JoinTable(
            name = "roles_privileges",
            joinColumns = @JoinColumn(
                    name = "role_name", referencedColumnName = "name"),
            inverseJoinColumns = @JoinColumn(
                    name = "privilege_name", referencedColumnName = "name"))
    private Collection<Privilege> privileges;

    public Role(String name) {
        this.name = name;
    }
}
