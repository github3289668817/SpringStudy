package per.xgt.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import per.xgt.domain.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/11/12 15:54
 */
public class MybatisTest {

    @Test
    public void test1(){
        try {
            //加载核心配置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            //获得session工厂对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //获得session会话对象
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //执行操作 
            List<User> userList = sqlSession.selectList("UserMapper.findAll");
            System.out.println(userList);
            //释放资源
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test11(){
        try {
            //加载核心配置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            //获得session工厂对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //获得session会话对象
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //执行操作
            User user = sqlSession.selectOne("UserMapper.findOne",2);
            System.out.println(user);
            //释放资源
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2(){
        //User对象
        User user = new User();
        user.setUsername("zyk");
        user.setPassword("ccc");
        try {
            //加载核心配置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            //获得session工厂对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //获得session会话对象
            SqlSession sqlSession = sqlSessionFactory.openSession();

            //自动提交事务
            //SqlSession sqlSession = sqlSessionFactory.openSession(true);

            //执行操作
            int i = sqlSession.insert("UserMapper.save", user);
            if (i < 1){
                System.out.println("插入失败");
            }else{
                System.out.println("插入成功");
            }
            //mybatis默认事务是不提交的，所以需要手动提交事务
            sqlSession.commit();
            //释放资源
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3(){
        //User对象
        User user = new User();
        user.setId(3);
        user.setUsername("zyk");
        user.setPassword("jjj");
        try {
            //加载核心配置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            //获得session工厂对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //获得session会话对象
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //执行操作
            int i = sqlSession.insert("UserMapper.update", user);
            if (i < 1){
                System.out.println("修改失败");
            }else{
                System.out.println("修改成功");
            }
            //mybatis默认事务是不提交的，所以需要手动提交事务
            sqlSession.commit();
            //释放资源
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test4(){
        //User对象
        int id = 4;
        try {
            //加载核心配置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            //获得session工厂对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            //获得session会话对象
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //执行操作
            int i = sqlSession.insert("UserMapper.delete", id);
            if (i < 1){
                System.out.println("删除失败");
            }else{
                System.out.println("删除成功");
            }
            //mybatis默认事务是不提交的，所以需要手动提交事务
            sqlSession.commit();
            //释放资源
            sqlSession.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
