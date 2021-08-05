package per.xgt.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import per.xgt.service.UserService;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/8/4 15:48
 */
public class UserController {

    /**
     * ApplicationContext的实现类：
     * ClassPathXmlApplicationContext：类的根路径下加载配置文件，推荐使用这种
     * FileSystemXmlApplicationContext：磁盘路径上加载配置文件，配置文件可以放在磁盘的任意位置
     * AnnotationConfigApplicationContext：当使用注解配置容器对象时，需要使用此类来创建Spring容器，它用来读取注解
     * @param args
     */
    public static void main(String[] args) {

        //ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app = new FileSystemXmlApplicationContext("E:\\IDEAProject\\SpringStudy\\SpringIOC\\src\\main\\resources\\applicationContext.xml");

        /**
         * 如果容器中只有一个此类型的bean 可以使用class类获取
         * 如果不唯一，通过id获取
         */
        //UserService userService = (UserService) app.getBean("userService");
        UserService userService = app.getBean(UserService.class);
        userService.save();

    }

}
