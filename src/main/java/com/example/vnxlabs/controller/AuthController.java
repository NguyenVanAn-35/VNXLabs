//package com.example.vnxlabs.controller;
//
//import com.example.vnxlabs.entity.NguoiDung;
//import com.example.vnxlabs.service.NguoiDungService;
//import jakarta.validation.Valid;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//
//@RestController
//@RequestMapping("/auth")
//public class AuthController {
//
//    private final NguoiDungService nguoiDungService;
//
//    public AuthController(NguoiDungService nguoiDungService) {
//        this.nguoiDungService = nguoiDungService;
//    }
//
//    // Đăng ký người dùng mới
//    @PostMapping("/register")
//    public ResponseEntity<String> register(@Valid @RequestBody NguoiDung nguoiDung) {
//        nguoiDungService.save(nguoiDung);
//        return ResponseEntity.ok("User registered successfully");
//    }
//
//}
