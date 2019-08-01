package git.gaozhanghappy.service;/**
 * Created by thinkpad on 2019/8/1.
 */

import git.gaozhanghappy.pojo.User;

import java.util.List;

/**
 * @author gaozhang
 * @ 2019/8/1 14:50
 */

public interface UserService {
    List<User> getBy(User user);
}
