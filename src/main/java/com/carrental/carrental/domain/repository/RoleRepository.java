package com.carrental.carrental.domain.repository;

import com.carrental.carrental.domain.Role;

import java.util.List;
import java.util.Optional;

public interface RoleRepository {
    List<Role> findAllRoles();
    Optional<Role> findRoleById(int id);
    Role createRole(Role role);
    boolean deleteRole(int id);
}
