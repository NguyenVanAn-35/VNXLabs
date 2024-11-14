package com.example.vnxlabs.service;

import com.example.vnxlabs.entity.NguoiDung;
import com.example.vnxlabs.repository.NguoiDungRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NguoiDungService {
    @Autowired
    private NguoiDungRepository nguoiDungRepository;

    public List<NguoiDung> getAll(){
        return nguoiDungRepository.findAll();
    }
}
