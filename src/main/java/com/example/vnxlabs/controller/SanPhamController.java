package com.example.vnxlabs.controller;

import com.example.vnxlabs.entity.SanPham;
import com.example.vnxlabs.service.impl.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class SanPhamController {
    @Autowired
    SanPhamService sanPhamService;
@GetMapping("/san-pham/hien-thi")
    public String hienThi(Model model){
    List<SanPham> products = sanPhamService.findAll();
    model.addAttribute("products", products);
    return "/menu/sanpham";
}
    @GetMapping("/san-pham/list")
    public List<SanPham> getAllResearchProducts() {
        return sanPhamService.findAll();
    }
}
