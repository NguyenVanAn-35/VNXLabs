package com.example.vnxlabs.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Ho_So_Ca_Nhan")
public class Portfolio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Trường ID (Primary Key)

    @ManyToOne
    @JoinColumn(name = "nguoi_dung_id", referencedColumnName = "id", nullable = false)
    private NguoiDung nguoiDung;  // Trường liên kết với bảng Nguoi_Dung (Foreign Key)

    @Column(name = "tieu_de", nullable = false, length = 200)
    private String tieuDe;  // Tiêu đề bài viết

    @Column(name = "mo_ta", columnDefinition = "TEXT")
    private String moTa;  // Mô tả bài viết

    @Column(name = "anh_dai_dien_url", length = 255)
    private String anhDaiDienUrl;  // URL ảnh đại diện

    @Column(name = "ngay_tao", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date ngayTao;  // Ngày tạo

    @Column(name = "ngay_cap_nhat", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date ngayCapNhat;  // Ngày cập nhật
}
