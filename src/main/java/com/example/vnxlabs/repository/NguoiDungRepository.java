package com.example.vnxlabs.repository;

import com.example.vnxlabs.entity.NguoiDung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NguoiDungRepository extends JpaRepository<NguoiDung,Long> {

}
