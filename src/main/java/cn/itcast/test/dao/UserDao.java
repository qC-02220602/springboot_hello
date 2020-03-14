package cn.itcast.test.dao;

import cn.itcast.test.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDao extends JpaRepository<User,Long> {
    //注意SpringDataJPA默认会根据方法名自动生成sql:
    //select * from user where username = ? and password = ?
//    List<User> findByNameToList(String name);
//    User findByUsernameAndPassword(String username,String password);

    @Query("select u from User u where u.id = ?1")
    User findBySQLToID(Long id);
}
