package jm.task.core.jdbc;
import java.sql.Connection;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte)35);
        userService.saveUser("Sasha", "Loko", (byte)88);
        userService.saveUser("Nlili", "Nlilieva", (byte)105);
        userService.saveUser("Dima", "Petrov", (byte)55);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
