package com.example.vnxlabs.service;

import com.example.vnxlabs.entity.SanPham;
import com.example.vnxlabs.repository.SanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SanPhamService{
@Autowired
private SanPhamRepository sanPhamRepository;
    public List<SanPham> findAll() {
        return sanPhamRepository.findAll();
    }

    public Optional<SanPham> findById(Integer id) {
        return Optional.empty();
    }

    public SanPham save(SanPham sanPham) {
        return null;
    }

    public void deleteById(Integer id) {

    }
}
