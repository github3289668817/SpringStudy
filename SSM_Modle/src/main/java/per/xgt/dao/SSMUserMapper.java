package per.xgt.dao;

import org.springframework.stereotype.Repository;
import per.xgt.pojo.SSMUser;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/12/1 10:24
 */
@Repository
public interface SSMUserMapper {

    public SSMUser findOneById(Integer id);

}
