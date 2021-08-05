package per.xgt.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import per.xgt.dao.UserDao;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/8/4 14:47
 */
public class UserDaoDemo {

    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();

    }

}
