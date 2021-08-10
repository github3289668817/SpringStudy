package per.xgt.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import per.xgt.configration.SpringConfiguration;
import per.xgt.service.UserService;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/8/5 17:15
 */
public class UserController {

//    public static void main(String[] args) {
//
//        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        UserService userService = app.getBean(UserService.class);
//        userService.save();
//
//    }

    public static void main(String[] args) {

        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = (UserService) app.getBean("userService");
        userService.save();

    }

}
