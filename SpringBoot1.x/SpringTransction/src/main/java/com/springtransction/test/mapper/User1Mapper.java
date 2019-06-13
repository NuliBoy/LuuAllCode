package com.springtransction.test.mapper;

import com.springtransction.test.bean.User1;

public interface User1Mapper {
    int insert(User1 record);
    User1 selectByPrimaryKey(Integer id);
    //其他方法省略...
}