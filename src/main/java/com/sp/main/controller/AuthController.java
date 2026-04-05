package com.sp.main.controller;



import com.sp.main.dto.AuthRequest;
import com.sp.main.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService service;

    @PostMapping("/register")
    public String register(@RequestBody AuthRequest req) {
        return service.registerUser(req);
    }
}