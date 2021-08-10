package per.xgt.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import per.xgt.dao.UserDao;
import per.xgt.service.UserService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/8/5 17:11
 */
//@Component("userService")
@Service("userService")
@Scope("prototype")
public class UserServiceImpl implements UserService {

    @Value("${jdbc.driver}")
    private String driver;

    //按照数据类型从Spring容器中进行匹配
    //@Autowired
    //是按照id值从容器中进行匹配，注意：此处@Qualifier要结合@Autowired一起使用
    //@Qualifier("userDao")
    //@Resource相当于@Autowired+@Qualifier
    @Resource(name = "userDao")
    private UserDao userDao;

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void save() {
        System.out.println(driver);
        userDao.save();
    }

    //bean的初始化方法
    @PostConstruct
    public void init(){
        System.out.println("Service创建初始化");
    }

    //bean的销毁方法
    @PreDestroy
    public void destory(){
        System.out.println("Service的销毁方法");
    }

}
