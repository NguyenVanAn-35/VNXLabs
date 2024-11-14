package com.example.vnxlabs.controller;

import com.example.vnxlabs.entity.Portfolio;
import com.example.vnxlabs.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PortfolioController {
    @Autowired
    private PortfolioService portfolioService;

    @GetMapping("/portfolio/hien-thi")
    public String hienThi(){
        return "/menu/portfolio";
    }
}
