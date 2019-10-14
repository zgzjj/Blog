package com.ccz.blog.service;

import com.ccz.blog.dao.UserDao;
import com.ccz.blog.entity.UserPo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/14 11:05
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public UserPo selectById(Integer id){
        return userDao.getOne(id);
    }

    public UserPo insert(UserPo userPo){
        return userDao.save(userPo);
    }

    @Transactional
    public UserPo update(UserPo userPo){
        return userDao.save(userPo);
    }

}
