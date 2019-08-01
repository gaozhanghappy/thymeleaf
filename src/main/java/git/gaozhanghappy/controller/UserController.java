package git.gaozhanghappy.controller;/**
 * Created by thinkpad on 2019/8/1.
 */

import git.gaozhanghappy.pojo.User;
import git.gaozhanghappy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.Oneway;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author gaozhang
 * @ 2019/8/1 14:47
 */
@RestController("/users")
public class UserController {
    @Autowired
    private UserService userService;



    @GetMapping
    @ResponseBody
    public Object getBy(){
        User user=new User(null,"张三"," ");
        String username = user.getUsername().replace(" ", "");
        String password = user.getPassword().replace(" ", "");


        User user1=new User(null,username,password);
        List<User> by = userService.getBy(user1);
        if (by.size()==0){
            return "未能查询到符合条件的数据";
        }
        return by;
    }
}
