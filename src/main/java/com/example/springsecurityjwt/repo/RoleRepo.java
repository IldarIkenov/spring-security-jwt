package com.example.springsecurityjwt.repo;

import com.example.springsecurityjwt.domain.Role;
import com.example.springsecurityjwt.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
