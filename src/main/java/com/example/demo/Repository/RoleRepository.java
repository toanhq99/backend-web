package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.management.relation.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findRoleEntitiesByName(String name);

    Role findRoleEntityById(Integer integer);
}
