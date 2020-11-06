import com.kuang.dao.UserMapper;
import com.kuang.pojo.User;
import com.kuang.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        List<User> users = userMapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }

//
//        User userById = userMapper.getUserById(1);
//        System.out.println(userById);


//        userMapper.addUser(new User(5, "张飞","333333"));
//


//        userMapper.updateUser(new User(5,"关于","444444"));
//        userMapper.deleteUser(5);
        sqlSession.close();
    }
}
