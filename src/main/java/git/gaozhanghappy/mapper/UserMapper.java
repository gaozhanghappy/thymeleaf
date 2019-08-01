package git.gaozhanghappy.mapper;/**
 * Created by thinkpad on 2019/8/1.
 */

import git.gaozhanghappy.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author gaozhang
 * @ 2019/8/1 14:45
 */
public interface UserMapper {
    List<User> getBy(User user);
}
