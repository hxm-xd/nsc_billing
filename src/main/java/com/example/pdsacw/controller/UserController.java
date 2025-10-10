package com.example.pdsacw.controller;

import com.example.pdsacw.dto.UserDTO;
import com.example.pdsacw.entity.User;
import com.example.pdsacw.repository.UserRepository;
import com.example.pdsacw.service.UserService;
import jakarta.validation.Valid;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
@EnableMethodSecurity
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }


    @PostMapping
    public UserDTO createUser(@Valid @RequestBody UserDTO userDTO) {
       User user = userService.toEntity(userDTO);
       User savedUser = userRepository.save(user);

       return  userService.toDTO(savedUser);
    }

    @PreAuthorize("hasAnyRole('ADMIN','MANAGER')")
    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(userService::toDTO)
                .toList();
    }

    @PreAuthorize("hasAnyRole('ADMIN', 'MANAGER')")
    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable long id) {
        User user = userService.getUserById(id)
                .orElseThrow(() -> new RuntimeException("User with id " + id + " not found")
                );
        return userService.toDTO(user);
    }

    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    @PutMapping("/{id}")
    public UserDTO updateUser(@PathVariable long id, @Valid @RequestBody UserDTO userDTO) {
        User existingUser = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

        existingUser.setUsername(userDTO.getUsername());
        existingUser.setPassword(userDTO.getPassword());

        return userService.toDTO(userService.updateUser(existingUser));
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable long id) {
        userService.deleteUser(id);
    }
}

