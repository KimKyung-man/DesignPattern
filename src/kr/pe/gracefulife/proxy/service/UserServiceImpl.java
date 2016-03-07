package kr.pe.gracefulife.proxy.service;

import java.util.List;

/**
 * Created by Gracefulife on 2016-03-07.
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<String> findAll() {
        System.out.println("Original findAll Service");
        return null;
    }

    @Override
    public String findById(String id) {
        System.out.println("Original findById Service");
        return null;
    }

}
