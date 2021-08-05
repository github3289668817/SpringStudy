package per.xgt.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import per.xgt.dao.UserDao;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/8/4 15:10
 */
public class SpringTest {

    /**
     * 测试scope属性
     */
    @Test
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) app.getBean("userDao");
        UserDao userDao2 = (UserDao) app.getBean("userDao");
        System.out.println(userDao1 == userDao2);
    }

}
