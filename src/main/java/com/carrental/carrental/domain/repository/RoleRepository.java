package com.carrental.carrental.domain.repository;

import com.carrental.carrental.domain.Role;

import java.util.Optional;

public interface RoleRepository {
    Iterable<Role> findAllRoles();
    Optional<Role> findRoleById(int id);
    Role createRole(Role role);
    void deleteRole(int id);
}
