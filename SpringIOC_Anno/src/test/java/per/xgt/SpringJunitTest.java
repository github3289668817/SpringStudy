package per.xgt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import per.xgt.configration.SpringConfiguration;
import per.xgt.service.UserService;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/8/10 16:06
 */
//
@RunWith(SpringJUnit4ClassRunner.class)
//指定配置文件或配置类
//@ContextConfiguration("classpath:applicationContext.xml")
@ContextConfiguration( classes = SpringConfiguration.class)
public class SpringJunitTest {

    @Autowired
    private UserService userService;
    @Autowired
    private DataSource dataSource;

    @Test
    public void test1(){
        userService.save();
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
