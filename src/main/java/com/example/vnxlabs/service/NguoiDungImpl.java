package com.example.vnxlabs.service;

import com.example.vnxlabs.entity.NguoiDung;
import com.example.vnxlabs.repository.NguoiDungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NguoiDungImpl {
    @Autowired
    private NguoiDungRepository nguoiDungRepository;

//    public NguoiDung dangKyNguoiDung(NguoiDung nguoiDung) {
//        // Mã hóa mật khẩu trước khi lưu
//        nguoiDung.setMatKhau(passwordEncoder.encode(nguoiDung.getMatKhau()));
//        return nguoiDungRepository.save(nguoiDung);
//    }
}