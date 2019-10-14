package com.ccz.blog.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/14 10:43
 */
@Data
@Entity
@Table(name = "blog_user")
public class UserPo {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "username", length = 32, nullable = false)
    private String username;    //用户名

    @Column(name = "password", length = 32, nullable = false)
    private String password;    //密码

    @Column(name = "nickname", length = 32, nullable = false)
    private String nickname;    //昵称

    @Column(name = "avatar_url", nullable = false)
    private String avatarUrl;   //头像链接

    @Column(name = "openid", length = 128)
    private String openid;  //微信openid

    @Column(name = "content")
    private String content; //个人简介

    @Column(name = "status", length = 8)
    private String status; //账号状态

    @Column(name = "create_time", length = 64, nullable = false)
    private String createTime;  //创建时间

    @Column(name = "update_time", length = 64, nullable = false)
    private String updateTime;  //更新时间

}
