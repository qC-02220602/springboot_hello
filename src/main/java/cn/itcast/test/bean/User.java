package cn.itcast.test.bean;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//@Entity //当前类为SpringDataJPA的实体类
//@Data   //使用Lombok增加gset方法等
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
//public class User {
//    @Id //表示为id主键
//    @GeneratedValue(strategy = GenerationType.IDENTITY)//表示主键生成策略使用数据库指针
//    private Long id;
//    @Column(name = "username")
//    private String username;
//    private String password;
//    private String nickname;
//}

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity //标识当前类为SpringDataJPA的实体类
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})//整合SpringDataJPA后数据转json需要配置的
public class User {
    @Id //当前字段对应于数据库中的ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)//按照数据库自己的自增方式进行自增
    private Long id;
    @Column(name = "username")
    private String username;
    private String password;
    private String nickname;
}


