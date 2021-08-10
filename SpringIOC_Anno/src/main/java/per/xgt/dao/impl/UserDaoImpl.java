package per.xgt.dao.impl;

import org.springframework.stereotype.Repository;
import per.xgt.dao.UserDao;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/8/5 17:09
 */
//@Component("userDao")
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("save running...");
    }
}
