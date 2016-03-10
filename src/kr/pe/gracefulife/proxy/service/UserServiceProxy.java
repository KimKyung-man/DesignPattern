package kr.pe.gracefulife.proxy.service;

import java.util.List;

/**
 * Created by Gracefulife on 2016-03-10.
 */
public class UserServiceProxy implements UserService {
    UserService originObject;

    public UserServiceProxy(UserService originObject) {
        this.originObject = originObject;
    }

    @Override
    public List<String> findAll() {
        System.out.println("Before findAll");
        List<String> list = originObject.findAll();
        System.out.println("After findAll");
        return list;
    }

    @Override
    public String findById(String id) {
        System.out.println("Proxy findById = " + id);
        return originObject.findById(id);
    }
}

