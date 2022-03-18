package com.carrental.carrental.infrastructure.repository.sql;

import com.carrental.carrental.domain.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepositoryCrud  extends CrudRepository<Role, Integer> {
}
