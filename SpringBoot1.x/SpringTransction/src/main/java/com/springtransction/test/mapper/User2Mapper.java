package com.springtransction.test.mapper;

import com.springtransction.test.bean.User1;
import com.springtransction.test.bean.User2;

public interface User2Mapper {
    int insert(User2 record);
    User2 selectByPrimaryKey(Integer id);
    //其他方法省略...
}