package jm.task.core.jdbc.util;

import com.mysql.jdbc.Driver;
import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {

    // реализуйте настройку соеденения с БД
    private static final String URL = "jdbc:mysql://localhost:3306/users?useUnicode=true&serverTimezone=UTC&" +
            "useSSL=true&verifyServerCertificate=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "G19932_1451269lolP";


    public Connection getConnection() {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Соединение установлено.");
        } catch (SQLException e) {
            System.err.println("Соединение НЕ установлено.");
        }
        return connection;
    }

}
