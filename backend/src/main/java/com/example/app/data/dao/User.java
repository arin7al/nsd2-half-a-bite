package com.example.app.data.dao;

import com.example.app.data.Status;
import com.sun.istack.NotNull;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Collection;
import java.util.UUID;

import static lombok.AccessLevel.PRIVATE;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@FieldDefaults(level = PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    UUID id;

    @NotNull
    String email;
    @NotNull
    String firstName;
    @NotNull
    String lastName;
    @NotNull
    String password;
    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_name", referencedColumnName = "name"))
    Collection<Role> roles;
    @Enumerated(EnumType.STRING)
    Status status;
}
