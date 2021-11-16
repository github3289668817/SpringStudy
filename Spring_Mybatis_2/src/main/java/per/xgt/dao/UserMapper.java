package per.xgt.dao;

import per.xgt.domain.User;

import java.util.List;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/11/15 15:15
 */
public interface UserMapper {

    public List<User> findAll();

    public User findById(int id);

}
