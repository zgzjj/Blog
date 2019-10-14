package com.ccz.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/11 16:42
 */
@RestController
public class AppSecurityController {

    @GetMapping("/hello")
    @ResponseBody
    public String home() {
        return "Hello ,spring security!";
    }

    @RequestMapping("/authentication/require")
    public String requireAuthentication(HttpServletRequest request, HttpServletResponse response){
        return null;
    }
}
