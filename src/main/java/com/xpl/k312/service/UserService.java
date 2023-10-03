package com.xpl.k312.service;

import com.xpl.k312.model.User;

import java.util.List;

public interface UserService {
    User getUser(int id);
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUser(int id);
}
