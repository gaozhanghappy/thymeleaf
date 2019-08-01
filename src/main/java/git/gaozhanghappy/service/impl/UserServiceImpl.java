package git.gaozhanghappy.service.impl;/**
 * Created by thinkpad on 2019/8/1.
 */

import git.gaozhanghappy.mapper.UserMapper;
import git.gaozhanghappy.pojo.User;
import git.gaozhanghappy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author gaozhang
 * @ 2019/8/1 14:53
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> getBy(User user) {
        List<User> by = userMapper.getBy(user);
        return by;
    }
}
