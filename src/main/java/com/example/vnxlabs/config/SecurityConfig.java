package com.example.vnxlabs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.ArrayList;
import java.util.List;

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
                // Cấu hình xác thực quyền truy cập
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/admin/**").hasRole("ADMIN") // Chỉ cho phép người dùng có vai trò ADMIN truy cập trang bắt đầu bằng /admin/
                        .anyRequest().permitAll() // Các yêu cầu khác không yêu cầu xác thực
                )
                // Cấu hình đăng nhập
                .formLogin(form -> form
                        .loginPage("/login") // Đường dẫn đến trang đăng nhập của bạn
                        .loginProcessingUrl("/login") // Đường dẫn xử lý đăng nhập
                        .permitAll() // Cho phép tất cả người dùng truy cập trang đăng nhập
                        .defaultSuccessUrl("/trang-chu", true) // Trang đích sau khi đăng nhập thành công
                )
                // Cấu hình đăng xuất
                .logout(logout -> logout
                        .permitAll() // Cho phép tất cả người dùng đăng xuất mà không cần xác thực
                )
                // Bảo vệ CSRF (nếu bạn sử dụng form gửi dữ liệu POST)
                .csrf(csrf -> csrf
                        .ignoringRequestMatchers("/admin/portfolio/add") // Tắt CSRF cho URL này nếu cần, hoặc bạn có thể giữ CSRF và phải thêm token trong form
                );

        return http.build();
    }


    @Bean
    public UserDetailsService userDetailsService(){
        PasswordEncoder pe= passwordEncoder();
        List<UserDetails> listUser=new ArrayList<>();
        UserDetails user=User.builder()
                .username("user1")
                .password(pe.encode("123"))
                .roles("USER")
                .build();
        listUser.add(user);

        UserDetails admin=User.builder()
                .username("admin")
                .password(pe.encode("123"))
                .roles("ADMIN")
                .build();
        listUser.add(admin);

        return new InMemoryUserDetailsManager(listUser);
    }

}
