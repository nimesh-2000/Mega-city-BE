package org.denuwan.mega.megacity.service;


import org.denuwan.mega.megacity.entity.User;

import java.util.List;

public interface UserManageService {
    List<User> getAllUsers();

    List<User> getUsersByEmail(String email);
    List<User> getUsersByRole(String role);
    boolean updateUser(int userId, User updatedUser);
    boolean deleteUser(int userId);
}
