package com.chengang.webservice.cxf.server.service.impl;

import com.chengang.webservice.cxf.server.model.User;
import com.chengang.webservice.cxf.server.service.UserService;

import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@WebService(targetNamespace="http://service.demo1.ws.chengang.com/",endpointInterface = "com.chengang.webservice.cxf.server.service.UserService")
public class UserServiceImpl implements UserService {
    private Map<String, User> userMap = new HashMap<String, User>();
    public UserServiceImpl() {
        System.out.println("向实体类插入数据");
        User user = new User();
        user.setUserId("411001");
        user.setUsername("zhansan");
        user.setAge("20");
        user.setUpdateTime(new Date());
        userMap.put(user.getUserId(), user);

        user = new User();
        user.setUserId("411002");
        user.setUsername("lisi");
        user.setAge("30");
        user.setUpdateTime(new Date());
        userMap.put(user.getUserId(), user);

        user = new User();
        user.setUserId("411003");
        user.setUsername("wangwu");
        user.setAge("40");
        user.setUpdateTime(new Date());
        userMap.put(user.getUserId(), user);
    }
    @Override
    public String getName(String userId) {
        return "liyd-" + userId;
    }
    @Override
    public User getUser(String userId) {
        User user= userMap.get(userId);
        return user;
    }

    @Override
    public ArrayList<User> getAlLUser() {
        ArrayList<User> users=new ArrayList<>();
        userMap.forEach((key,value)->{users.add(value);});
        return users;
    }

    @Override
    public String getUserName(String id) {
        return userMap.get(id).getUsername();
    }
}