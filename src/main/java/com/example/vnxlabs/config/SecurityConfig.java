package com.example.vnxlabs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/", "/login","/trang-chu","/css/**","/js/**","/img/**","/san-pham/hien-thi","/san-pham/list").permitAll() // Cho phép truy cập công khai cho trang chủ và các trang liên quan
                        .anyRequest().authenticated() // Yêu cầu xác thực cho các trang còn lại
                )
                .formLogin(form -> form
                        .loginPage("/login")
                        .permitAll() // Cho phép tất cả người dùng truy cập trang đăng nhập
                )
                .logout(logout -> logout
                        .permitAll() // Cho phép tất cả người dùng thực hiện đăng xuất
                );
        return http.build();
    }
}
