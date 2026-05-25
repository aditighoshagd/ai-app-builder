package com.aditi.project.lovable_clone.service;

import com.aditi.project.lovable_clone.dto.auth.AuthResponse;
import com.aditi.project.lovable_clone.dto.auth.SignUpRequest;
import com.aditi.project.lovable_clone.dto.auth.LoginRequest;

public interface AuthService {
   AuthResponse signup(SignUpRequest request);

     AuthResponse login(LoginRequest request);
}
