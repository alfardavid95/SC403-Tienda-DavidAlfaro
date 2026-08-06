package com.tienda.config;

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

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests((request) -> request
                .requestMatchers(
                    "/",
                    "/index",
                    "/login",
                    "/acceso_denegado",
                    "/consultas/**",
                    "/webjars/**",
                    "/css/**",
                    "/js/**",
                    "/images/**",
                    "/img/**",
                    "/fav/**",
                    "/error"
                ).permitAll()
                .requestMatchers("/perfil").authenticated()
                .requestMatchers("/categoria/**", "/producto/**").hasAnyRole("ADMIN", "VENDEDOR")
                .requestMatchers("/usuario/**").hasRole("ADMIN")
                .anyRequest().authenticated()
            )
            .formLogin((form) -> form
                .loginPage("/login")
                .defaultSuccessUrl("/", true)
                .permitAll()
            )
            .logout((logout) -> logout
                .logoutSuccessUrl("/")
                .permitAll()
            )
            .exceptionHandling((exception) -> exception
                .accessDeniedPage("/acceso_denegado")
            );

        return http.build();
    }

    @Bean
    public UserDetailsService users(PasswordEncoder passwordEncoder) {
        UserDetails admin = User.builder()
            .username("juan")
            .password(passwordEncoder.encode("123"))
            .roles("ADMIN")
            .build();

        UserDetails vendedor = User.builder()
            .username("rebeca")
            .password(passwordEncoder.encode("456"))
            .roles("VENDEDOR")
            .build();

        UserDetails usuario = User.builder()
            .username("pedro")
            .password(passwordEncoder.encode("789"))
            .roles("USUARIO")
            .build();

        return new InMemoryUserDetailsManager(admin, vendedor, usuario);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
