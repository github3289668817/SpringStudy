package per.xgt.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import per.xgt.domain.Account;

import java.util.List;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/9/23 15:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateCRUDTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test1(){
        int i = jdbcTemplate.update("update test_account set money = ? where name = ?", 88.88, "xgt");
        System.out.println(i);
    }

    @Test
    public void test2(){
        int i = jdbcTemplate.update("delete from test_account where name = ?",  "xgt");
        System.out.println(i);
    }

    /**
     * 查询多条对象
     */
    @Test
    public void test3(){
        List<Account> list = jdbcTemplate.query("select * from test_account", new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(list);
    }

    /**
     * 查询一个对象
     */
    @Test
    public void test4(){
        Account flh = jdbcTemplate.queryForObject("select * from test_account where name = ?", new BeanPropertyRowMapper<Account>(Account.class), "tiantian");
        System.out.println(flh);
    }

    /**
     * 查询一个数值数据
     */
    @Test
    public void test5(){
        Integer i = jdbcTemplate.queryForObject("select count(1) from test_account",Integer.class);
        System.out.println(i);
    }

}
