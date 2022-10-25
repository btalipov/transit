package kz.talipov.transit.services;

import kz.talipov.transit.models.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();
    User addUser (User user);
    User updateUser (User user);
    void deleteUserById(Long id);
}

//    Optional<User> findByLogin(String login);
//
//    User register(String email, String password);
//
//    void changePassword(User user, String currentPassword, String newPassword);
//
//    User login(String login, String password);
//
//    boolean checkPassword(String hashPassword, String password);
//}
