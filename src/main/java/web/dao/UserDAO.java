package web.dao;

import web.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void createUser(User user);

    User readUser(long id);

    void updateUser(User userOld, Long id);

    void deleteUser(long id);
}