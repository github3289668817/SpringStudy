package per.xgt.domain;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/11/12 15:34
 */
public class User {

    private int id;
    private String username;
    private String password;

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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", paaword='" + password + '\'' +
                '}';
    }

}
