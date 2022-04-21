package ru.kata.spring.boot_security.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.model.Role;


@Component
public class SaveRole {

    private final RoleDao roleDao;

    @Autowired
    public SaveRole(RoleDao roleDao) {
        this.roleDao = roleDao;
        Save();
    }

    private void Save(){
        if(!roleDao.existsByName("ROLE_ADMIN")) {
            roleDao.save(new Role("ROLE_ADMIN"));
        }
        if(!roleDao.existsByName("ROLE_USER")) {
            roleDao.save(new Role("ROLE_USER"));
        }
    }
}
