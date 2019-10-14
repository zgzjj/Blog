package com.ccz.blog.controller;

import com.ccz.blog.common.AjaxResult;
import com.ccz.blog.entity.UserPo;
import com.ccz.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/14 11:13
 */
@RestController
@RequestMapping("/api/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("insert")
    @ResponseBody
    public AjaxResult insertUser(@RequestBody UserPo userPo){
        UserPo user = userService.insert(userPo);
        if(user != null){
            return AjaxResult.success(user);
        }
        return AjaxResult.error("添加用户失败！");
    }
}
