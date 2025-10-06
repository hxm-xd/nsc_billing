package com.example.pdsacw.dto;

import jakarta.validation.constraints.NotNull;

public class UserDTO {

    private int UserId;

    @NotNull(message = "Name cannot be null")
    private String Username;

    @NotNull(message = "Email cannot be null")
    private String email;

    @NotNull(message = "Password cannot be null")
    private String Password;

    @NotNull
    private String Role;

    public UserDTO() {}

    public UserDTO(int  UserId, String Username, String email, String Password, String role) {
        this.UserId = UserId;
        this.Username = Username;
        this.email = email;
        this.Password = Password;
        this.Role = role;
    }

    public int getUserId() {
        return UserId;
    }
    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        Username = username;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }

    public String getRole() {
        return Role;
    }
    public void setRole(String role) {
        Role = role;
    }
}
