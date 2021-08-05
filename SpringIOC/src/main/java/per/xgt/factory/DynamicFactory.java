package per.xgt.factory;

import per.xgt.dao.UserDao;
import per.xgt.dao.impl.UserDaoImpl;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/8/4 15:38
 */
public class DynamicFactory {

    public UserDao getUserDao(){
        return new UserDaoImpl();
    }

}
