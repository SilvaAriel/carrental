package com.carrental.carrental.domain.repository;

import com.carrental.carrental.domain.User;

import java.util.Optional;

public interface UserRepository {
    Iterable<User> findAllUsers();
    Optional<User> findUserById(int id);
    User createUser(User user);
    User editUser(User user);
    boolean deleteUser(int id);
}
