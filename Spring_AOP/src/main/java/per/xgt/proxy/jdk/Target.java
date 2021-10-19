package per.xgt.proxy.jdk;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/10/19 15:18
 */
public class Target implements TargetInterface{

    @Override
    public void save() {
        System.out.println("save running......");
    }

}
