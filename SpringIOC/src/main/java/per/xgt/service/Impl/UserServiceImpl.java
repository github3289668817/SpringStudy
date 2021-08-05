package per.xgt.service.Impl;

import per.xgt.dao.UserDao;
import per.xgt.service.UserService;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/8/4 15:45
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    /*public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    @Override
    public void save() {
        userDao.save();
    }
}
