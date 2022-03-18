package com.carrental.carrental.infrastructure.repository.sql.configuration;

import com.carrental.carrental.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryCrud extends CrudRepository<User, Integer> {
}
