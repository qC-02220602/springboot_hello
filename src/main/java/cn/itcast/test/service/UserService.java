package cn.itcast.test.service;

import cn.itcast.test.bean.User;

import java.util.List;

public interface UserService {
     void add(User user);
     public List<User> findAll();
     User findBySQLToID(Long id);
}
