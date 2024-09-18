package com.example.vnxlabs.service;

import com.example.vnxlabs.entity.SanPham;
import com.example.vnxlabs.service.impl.SanPhamService;

import java.util.List;
import java.util.Optional;

public class SanPhamImpl implements SanPhamService {

    @Override
    public List<SanPham> findAll() {
        return null;
    }

    @Override
    public Optional<SanPham> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public SanPham save(SanPham sanPham) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
