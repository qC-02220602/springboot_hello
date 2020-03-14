package cn.itcast.test.service;

import cn.itcast.test.bean.User;
import cn.itcast.test.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public void add(User user) {
        userDao.save(user);
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findBySQLToID(Long id) {
        return userDao.findBySQLToID(id);
    }
}
