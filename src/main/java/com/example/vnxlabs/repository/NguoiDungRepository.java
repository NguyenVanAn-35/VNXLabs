package com.example.vnxlabs.repository;

import com.example.vnxlabs.entity.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NguoiDungRepository extends JpaRepository<NguoiDung,Long> {
    Optional<NguoiDung> findByTenDangNhap(String tenDangNhap);
}
