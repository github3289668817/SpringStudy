package per.xgt.dao.impl;

import per.xgt.dao.UserDao;
import per.xgt.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/8/4 14:44
 */
public class UserDaoImpl implements UserDao {

    private String username;
    private int age;
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;

    public List<String> getStrList() {
        return strList;
    }

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public Map<String, User> getUserMap() {
        return userMap;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoImpl() {
        System.out.println("UserDaoImpl无参构造...");
    }

    public void init(){
        System.out.println("初始化方法...");
    }

    public void destory(){
        System.out.println("销毁方法...");
    }

    @Override
    public void save() {
        System.out.println(strList);
        System.out.println(userMap);
        System.out.println(properties);
        System.out.println("save running...");
    }
}
