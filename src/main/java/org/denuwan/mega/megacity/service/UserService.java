package org.denuwan.mega.megacity.service;


import org.denuwan.mega.megacity.dto.ProfileImageDTO;
import org.denuwan.mega.megacity.entity.User;

import jakarta.mail.MessagingException;

import java.sql.SQLException;

public interface UserService {
    boolean registerUser(User user);

    User authenticateUser(String username, String password);
    User getUserByUsername(String username);
    User getUserByEmail(String email);
//    UserDTO getUserByUsername(String username);


    boolean uploadProfileImage(String email, String imagePath);  // Upload profile image
    ProfileImageDTO getProfileImage(String email);  // Retrieve profile image details

    String forgotPassword(String email) throws MessagingException;

    boolean verifyOtp(String email, String otpCode);

    boolean changePassword(String email, String newPassword);

    User getDriverUsers() throws SQLException;

    User getUserById(int id ) throws SQLException;
}
