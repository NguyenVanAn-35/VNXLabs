package com.example.vnxlabs.service.impl;

import com.example.vnxlabs.entity.SanPham;

import java.util.List;
import java.util.Optional;

public interface SanPhamService {

    List<SanPham> findAll();

    Optional<SanPham> findById(Integer id);

    SanPham save(SanPham sanPham);

    void deleteById(Integer id);

}
