package per.xgt.proxy.cglib;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/10/19 15:19
 */
public class Advice {

    public void before(){
        System.out.println("前置增强......");
    }

    public void afterReturning(){
        System.out.println("后置增强......");
    }

}
