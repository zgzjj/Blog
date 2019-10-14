package com.ccz.blog.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/14 11:32
 */
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.formLogin()
//                .loginPage("")
                .and()
                .authorizeRequests()
                .antMatchers("/api/user/insert").permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable();
    }
}
