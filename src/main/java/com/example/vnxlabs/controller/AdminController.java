package com.example.vnxlabs.controller;

import com.example.vnxlabs.entity.NguoiDung;
import com.example.vnxlabs.entity.Portfolio;
import com.example.vnxlabs.entity.SanPham;
import com.example.vnxlabs.service.NguoiDungService;
import com.example.vnxlabs.service.PortfolioService;
import com.example.vnxlabs.service.SanPhamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private SanPhamService sanPhamService;

    @Autowired
    private PortfolioService portfolioService;

    @Autowired
    private NguoiDungService nguoiDungService;

    @GetMapping("/hien-thi")
    public String hienThi(Model model){
        List<SanPham> sanPhamList = sanPhamService.findAll();
        model.addAttribute("sanPhamList",sanPhamList);

        List<Portfolio> portfolioList=portfolioService.getAll();
        model.addAttribute("portfolioList",portfolioList);

        List<NguoiDung> nguoiDungList=nguoiDungService.getAll();
        model.addAttribute("nguoiDungList",nguoiDungList);
        return "/viewadmin/index";
   }

    @PostMapping("/portfolio/add")
    public String themPortfolio(
            @ModelAttribute("portfolio") Portfolio portfolio,
            BindingResult result,
            @RequestParam("image") MultipartFile imageFile,
            Model model) {

        if (result.hasErrors()) {
            return "portfolio_add"; // trả lại trang nếu có lỗi
        }

        // Lưu ảnh và thiết lập các giá trị cho portfolio
        String imageUrl = saveImage(imageFile);
        portfolio.setAnhDaiDienUrl(imageUrl);
        portfolio.setNgayTao(new Date());
        portfolio.setNgayCapNhat(new Date());

        // Lưu portfolio vào cơ sở dữ liệu
        portfolioService.save(portfolio);
        return "redirect:/admin/hien-thi";
    }

    @GetMapping("/delete-portfolio/{id}")
    public String deletePortfolio(@PathVariable("id") Long id){
                 portfolioService.delete(id);
        return "redirect:/admin/hien-thi";
    }

    private String saveImage(MultipartFile imageFile) {
        try {
            if (imageFile != null && !imageFile.isEmpty()) {
                // Define the directory where images will be saved
                Path uploadPath = Paths.get("uploads/");
                if (!Files.exists(uploadPath)) {
                    Files.createDirectories(uploadPath);
                }

                // Save the file
                String filename = imageFile.getOriginalFilename();
                Path filePath = uploadPath.resolve(filename);
                Files.copy(imageFile.getInputStream(), filePath);

                // Return the relative path to the image
                return "/uploads/" + filename;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null; // Return null if there's an error
    }


}
