//package com.example.vnxlabs.controller;
//
//import com.example.vnxlabs.entity.NguoiDung;
//import com.example.vnxlabs.entity.Portfolio;
//import com.example.vnxlabs.entity.SanPham;
//import com.example.vnxlabs.service.NguoiDungService;
//import com.example.vnxlabs.service.PortfolioService;
//import com.example.vnxlabs.service.SanPhamService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/admin")
//public class Test {
//
//    @Autowired
//    private SanPhamService sanPhamService;
//
//    @Autowired
//    private PortfolioService portfolioService;
//
//    @Autowired
//    private NguoiDungService nguoiDungService;
//
//    @GetMapping("/hien-thi")
//    public String hienThi(Model model){
//        List<SanPham> sanPhamList = sanPhamService.findAll();
//        model.addAttribute("sanPhamList",sanPhamList);
//
//        List<Portfolio> portfolioList=portfolioService.getAll();
//        model.addAttribute("portfolioList",portfolioList);
//
//        List<NguoiDung> nguoiDungList=nguoiDungService.getAll();
//        model.addAttribute("nguoiDungList",nguoiDungList);
//        return "view_admin";
//    }
//}
