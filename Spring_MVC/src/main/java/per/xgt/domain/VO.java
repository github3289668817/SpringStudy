package per.xgt.domain;

import java.util.List;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/9/14 17:03
 */
public class VO {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "VO{" +
                "userList=" + userList +
                '}';
    }
}
