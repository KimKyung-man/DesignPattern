package kr.pe.gracefulife.proxy.service;

import java.util.List;

/**
 * 일반적인 User CRUD 관련 Service interface
 * Created by Gracefulife on 2016-03-07.
 */
public interface UserService {
    List<String> findAll();

    String findById(String id);

}
