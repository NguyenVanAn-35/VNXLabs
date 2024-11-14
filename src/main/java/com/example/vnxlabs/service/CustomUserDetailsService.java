//package com.example.vnxlabs.security;
//
//
//import com.example.vnxlabs.entity.NguoiDung;
//import com.example.vnxlabs.repository.NguoiDungRepository;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomUserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
//
//    private final NguoiDungRepository nguoiDungRepository;
//
//    public CustomUserDetailsService(NguoiDungRepository nguoiDungRepository) {
//        this.nguoiDungRepository = nguoiDungRepository;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        NguoiDung nguoiDung = nguoiDungRepository.findByTenDangNhap(username)
//                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
//
//        return User.builder()
//                .username(nguoiDung.getTenDangNhap())
//                .password(nguoiDung.getMatKhau())
//                .roles(nguoiDung.getVaiTro())
//                .build();
//    }
//}
