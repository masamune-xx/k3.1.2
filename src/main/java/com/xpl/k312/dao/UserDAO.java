package com.xpl.k312.dao;

import com.xpl.k312.model.User;

import java.util.List;

public interface UserDAO {
    User getUser(int id);
    List<User> getAllUsers();
    void saveUser(User user);
    void deleteUser(int id);
}
