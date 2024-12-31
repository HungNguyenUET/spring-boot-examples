package com.example.security_jwt_demo.payload;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private String password;
}
