package com.example.jwt_authentication.controller;

import com.example.jwt_authentication.util.JwtUtil;
import com.example.jwt_authentication.model.AuthResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public AuthResponse authenticate(Authentication authentication) {
        String username = authentication.getName();
        String token = jwtUtil.generateToken(username);
        return new AuthResponse(token);
    }
}
