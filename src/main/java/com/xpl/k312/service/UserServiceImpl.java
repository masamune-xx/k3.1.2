package com.xpl.k312.service;

import com.xpl.k312.dao.UserDAO;
import com.xpl.k312.model.User;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    private final PasswordEncoder encoder;

    public UserServiceImpl(UserDAO userDAO, @Lazy PasswordEncoder encoder) {
        this.userDAO = userDAO;
        this.encoder = encoder;
    }

    @Override
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    public void saveUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        userDAO.saveUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }
}
