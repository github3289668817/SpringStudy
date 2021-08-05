package per.xgt.factory;

import per.xgt.dao.UserDao;
import per.xgt.dao.impl.UserDaoImpl;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/8/4 15:34
 */
public class StaticFactory {

    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }

}
