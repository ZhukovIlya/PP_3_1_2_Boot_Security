package ru.kata.spring.boot_security.demo.service;


import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    void add(User user);
    List<User> listUsers();
    void deleteById(Long id);
    User getUserById(long id);
    User findByName(String name);
    User findByEmail(String name);
}
