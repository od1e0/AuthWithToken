package com.AuthWithToken.Auth.dto;

public class AuthenticationRequestDto {
    private String username;
    private String password;

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
