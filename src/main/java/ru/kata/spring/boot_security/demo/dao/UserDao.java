package ru.kata.spring.boot_security.demo.dao;


import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserDao {
    User getUser(Long id);

    List<User> getAllUsers();

    void createUser(User user);

    void updateUser(Long id, User user);

    void deleteUser(Long id);
}
