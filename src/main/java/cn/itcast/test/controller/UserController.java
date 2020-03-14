package cn.itcast.test.controller;

import cn.itcast.test.bean.User;
import cn.itcast.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //=@Controller(表示该类是一个控制器) + @ResponseBody(表示返回的数据格式为JSON)
//@Controller
@RequestMapping("user") //表示接受以user开头的请求映射
//如请求localhost:8081/user/hello?name=jack
public class UserController {
    @Autowired
    private UserService userService;


    //    @RequestMapping(path = "hello",method = RequestMethod.GET)
    @GetMapping("hello")
//    @ResponseBody
    public String hello(String name){
        return "hello "+name;
    }

    @PostMapping("add")
    public String add(User user){
        userService.add(user);
        return "success";
    }
    @GetMapping("findAll")
    public List<User> findAll(){
        return userService.findAll();
    }
    @GetMapping("findBySQLToID/{id}")
    public User findBySQLToID(@PathVariable Long id){
        return userService.findBySQLToID(id);
    }

}
