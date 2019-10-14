package com.ccz.blog.dao;

import com.ccz.blog.entity.UserPo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author: zjj
 * @desc
 * @date 2019/10/14 11:03
 */
@Repository
public interface UserDao  extends JpaRepository<UserPo, Integer>, JpaSpecificationExecutor<UserPo> {

}
