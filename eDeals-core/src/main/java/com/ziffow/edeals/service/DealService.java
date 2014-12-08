package com.ziffow.edeals.service;


import com.ziffow.edeals.mapper.user.UserMapper;
import com.ziffow.edeals.model.user.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zffow on 12/4/14.
 */

@Service(value = "dealService")
public class DealService implements IDealService{
    @Autowired
    UserMapper userMapper;
    public List sayHello(){
        return userMapper.selectByExample(new UserExample());


    }
}
