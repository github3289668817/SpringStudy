package per.xgt.service.impl;

import per.xgt.dao.UserDao;
import per.xgt.service.UserService;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/8/10 16:41
 */

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
