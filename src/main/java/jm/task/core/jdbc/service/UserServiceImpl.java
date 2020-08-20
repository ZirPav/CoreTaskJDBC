package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoJDBCImpl();

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void createUsersTable() {
        this.userDao.createUsersTable();
    }

    public void dropUsersTable() {
        this.userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        this.userDao.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        this.userDao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return this.userDao.getAllUsers();
    }

    public void cleanUsersTable() {
        this.userDao.cleanUsersTable();
    }
}
