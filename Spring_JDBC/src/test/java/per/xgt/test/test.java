package per.xgt.test;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.beans.PropertyVetoException;

/**
 *
 * @author Valen
 * @version V1.0
 * @date 2021/9/23 15:11
 */
public class test {

    /**
     * 测试JDBCTemplate开发步骤
     * @throws PropertyVetoException
     */
    @Test
    public void test1() throws PropertyVetoException {
        //创建一个数据源对象
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://121.5.179.160:3306/test");
        dataSource.setUser("root");
        dataSource.setPassword("root");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //设置数据源对象
        jdbcTemplate.setDataSource(dataSource);
        //执行操作
        int i = jdbcTemplate.update("insert into test_account values(?,?)", "flh", 666.66);
        System.out.println(i);
    }

    /**
     * 测试Spring产生JDBC模板对象
     * @throws PropertyVetoException
     */
    @Test
    public void test2() throws PropertyVetoException {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = app.getBean(JdbcTemplate.class);
        int i = jdbcTemplate.update("insert into test_account values(?,?)", "tiantian", 666.66);
        System.out.println(i);
    }

}
