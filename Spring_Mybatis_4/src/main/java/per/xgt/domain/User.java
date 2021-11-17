package per.xgt.domain;

import java.util.Date;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/11/12 15:34
 * <p>
 * 2021-11-17数据库中添加一个birthday字段
 */
public class User {

    private int id;
    private String username;
    private String password;
    private Date birthday;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String paaword) {
        this.password = paaword;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                '}';
    }

}
