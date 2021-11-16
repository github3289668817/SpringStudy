package per.xgt.service;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import per.xgt.dao.UserMapper;
import per.xgt.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/11/15 16:09
 */
public class ServiceDemo {

    public static void main(String[] args) throws IOException {

        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sessionFactory.openSession(true);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        List<User> userList = mapper.findAll();
        System.out.println(userList);
        User user = mapper.findById(1);
        System.out.println(user);

    }

}
