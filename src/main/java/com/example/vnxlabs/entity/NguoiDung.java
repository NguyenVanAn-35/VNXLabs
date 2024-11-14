package com.example.vnxlabs.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Nguoi_Dung")
public class NguoiDung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    private String ten_dang_nhap;

    @Email
    @NotEmpty
    private String email;

    @NotEmpty
    private String mat_khau;

    private String vai_tro ;

    @Temporal(TemporalType.DATE)
    @Column(name = "ngay_tao")
    private Date ngay_tao ;

    @Temporal(TemporalType.DATE)
    @Column(name = "ngay_cap_nhat")
    private Date ngay_cap_nhat;

}
