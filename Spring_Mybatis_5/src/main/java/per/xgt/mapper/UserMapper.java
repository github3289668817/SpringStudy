package per.xgt.mapper;

import per.xgt.domain.User;

import java.util.List;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/11/16 15:34
 */
public interface UserMapper {

    public List<User> findAll();
    public List<User> findUserByRoleAll();

}
