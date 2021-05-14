package com.example.app.service;

import com.example.app.data.dto.Privilege;
import com.example.app.data.dto.Role;
import com.example.app.data.dto.User;
import com.example.app.data.repositories.PrivilegeRepository;
import com.example.app.data.repositories.RoleRepository;
import com.example.app.data.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Component
public class SetupDataLoader implements
        ApplicationListener<ContextRefreshedEvent> {

    boolean alreadySetup = false;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PrivilegeRepository privilegeRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {

        if (alreadySetup)
            return;
        Privilege tradePrivilege
                = createPrivilegeIfNotFound("TRADE_PRIVILEGE");
        Privilege emitPrivilege
                = createPrivilegeIfNotFound("EMIT_PRIVILEGE");
        Privilege adminPrivilege
                = createPrivilegeIfNotFound("ADMIN_PRIVILEGE");

        createRoleIfNotFound("ROLE_OPERATOR", Arrays.asList(adminPrivilege, emitPrivilege));
        createRoleIfNotFound("ROLE_ENTITY", Arrays.asList(emitPrivilege, tradePrivilege));
        createRoleIfNotFound("ROLE_PERSON", Arrays.asList(tradePrivilege));

        Role adminRole = roleRepository.findByName("ROLE_OPERATOR");
        User user = new User();
        user.setFirstName("Test");
        user.setLastName("Test");
        user.setPassword(passwordEncoder.encode("test"));
        user.setEmail("admin@test.com");
        user.setRoles(Arrays.asList(adminRole));
        user.setEnabled(true);
        userRepository.save(user);

        alreadySetup = true;
    }

    @Transactional
    private Privilege createPrivilegeIfNotFound(String name) {

        Privilege privilege = privilegeRepository.findByName(name);
        if (privilege == null) {
            privilege = new Privilege(name);
            privilegeRepository.save(privilege);
        }
        return privilege;
    }

    @Transactional
    private Role createRoleIfNotFound(
            String name, Collection<Privilege> privileges) {

        Role role = roleRepository.findByName(name);
        if (role == null) {
            role = new Role(name);
            role.setPrivileges(privileges);
            roleRepository.save(role);
        }
        return role;
    }
}