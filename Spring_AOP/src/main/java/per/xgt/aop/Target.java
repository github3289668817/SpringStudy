package per.xgt.aop;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/10/19 15:18
 */
public class Target implements TargetInterface {

    @Override
    public void save() {
        //int i = 1/0;
        System.out.println("aop save running......");
    }

}
