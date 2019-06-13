package com.yuqiyu.chapter13.service;

import com.yuqiyu.chapter13.entity.UserEntity;
import com.yuqiyu.chapter13.jpa.UserJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Administrator
 * @title: luyu
 * @ClassName chapter13
 * @description: TODO
 * @date 2019/3/27 18:37
 */
@Service
public class UserService {

    @Autowired
    UserJPA userJPA;

    @Autowired
    AddressService addressService;


    @Transactional(propagation = Propagation.REQUIRED)
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public  UserEntity save(UserEntity userEntity){

        userEntity =  userJPA.save(userEntity);
        try {
            addressService.throwExceptionInAddress();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        try {
//            throwExceptionInUser();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        throwExceptionInUser();
        return userEntity;
    }
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
    private void  throwExceptionInUser(){
        UserEntity userEntity = new UserEntity();
        userEntity.setName("测试**");
        userEntity.setAge(30);
        userEntity.setAddress("南京");
        userJPA.save(userEntity);

        if(true){
            throw  new RuntimeException();
        }

    }
}
