package com.carrental.carrental.infrastructure.repository.sql;

import com.carrental.carrental.domain.Role;
import com.carrental.carrental.domain.repository.RoleRepository;
import com.carrental.carrental.infrastructure.repository.sql.configuration.RoleRepositoryCrud;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SQLRoleRepository implements RoleRepository {

    private final RoleRepositoryCrud roleRepository;

    public SQLRoleRepository(final RoleRepositoryCrud roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Iterable<Role> findAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Optional<Role> findRoleById(int id) {
        return roleRepository.findById(id);
    }

    @Override
    public Role createRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteRole(int id) {
        roleRepository.deleteById(id);
    }
}
