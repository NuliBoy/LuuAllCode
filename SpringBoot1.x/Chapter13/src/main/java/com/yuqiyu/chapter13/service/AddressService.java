package com.yuqiyu.chapter13.service;

import com.yuqiyu.chapter13.entity.UserEntity;
import com.yuqiyu.chapter13.jpa.UserJPA;
import org.aspectj.weaver.ast.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Administrator
 * @title: luyu
 * @ClassName chapter13
 * @description: TODO
 * @date 2019/3/27 18:49
 */
@Service
public class AddressService {
    @Autowired
    UserJPA userJPA;

    @Transactional(propagation = Propagation.REQUIRED)
    public void throwExceptionInAddress(){
        UserEntity userEntity = new UserEntity();
        userEntity.setName("测试**");
        userEntity.setAge(30);
        userEntity.setAddress("南京");
        userJPA.save(userEntity);

        throw new RuntimeException();
    }
}
