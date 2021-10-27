package dao;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/10/27 14:55
 */
public interface AccountDao {

    public void out(String outMan,double money);

    public void in(String inMan,double money);

}
