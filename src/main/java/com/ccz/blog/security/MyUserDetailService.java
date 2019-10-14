package com.ccz.blog.security;

import com.ccz.blog.dao.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/14 11:52
 */
@Component
@Slf4j
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserDao userDao;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("登录用户名："+ username);
        return null;
    }
}
