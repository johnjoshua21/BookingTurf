package com.turfBooking.service.interfaces;

import com.turfBooking.dto.UserRequestDTO;
import com.turfBooking.dto.UserResponseDTO;
import com.turfBooking.dto.UserUpdateDTO;
import com.turfBooking.enums.UserRole;

import java.util.List;

public interface UserService {

    // Create new user
    UserResponseDTO createUser(UserRequestDTO userRequestDTO);

    // Get user by ID
    UserResponseDTO getUserById(Long id);

    // Get all users
    List<UserResponseDTO> getAllUsers();

    // Update user
    UserResponseDTO updateUser(Long id, UserUpdateDTO userUpdateDTO);

    // Delete user
    void deleteUser(Long id);

    // Get user by phone
    UserResponseDTO getUserByPhone(String phone);

    // Get users by role
    List<UserResponseDTO> getUsersByRole(UserRole role);

    // Search users by name
    List<UserResponseDTO> searchUsersByName(String name);

    // Get all turf owners
    List<UserResponseDTO> getAllTurfOwners();

    // Get all regular users
    List<UserResponseDTO> getAllRegularUsers();

    // Check if phone exists
    boolean phoneExists(String phone);

    // Get total users count
    long getTotalUsersCount();

    // Get users count by role
    long getUsersCountByRole(UserRole role);
}