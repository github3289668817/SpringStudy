package per.xgt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.xgt.dao.SSMUserMapper;
import per.xgt.pojo.SSMUser;
import per.xgt.service.SSMUserService;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/12/6 14:16
 */
@Service
public class SSMUserServiceImpl implements SSMUserService {

    @Autowired
    private SSMUserMapper ssmUserMapper;

    @Override
    public SSMUser findOneById(Integer id) {
        return ssmUserMapper.findOneById(id);
    }
}
