package com.example.vnxlabs.controller;

import com.example.vnxlabs.entity.NguoiDung;
import com.example.vnxlabs.repository.NguoiDungRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
public class NguoiDungController {

    @Autowired
    private NguoiDungRepository nguoiDungRepository;

    @GetMapping("/trang-chu")
    public String trangChu(){
        return "/menu/trangchu";
    }

}
