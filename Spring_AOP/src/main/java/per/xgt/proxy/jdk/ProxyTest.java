package per.xgt.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/10/19 15:21
 */
public class ProxyTest {

    public static void main(String[] args) {

        //创建目标对象
        final Target target = new Target();
        //获得增强对象
        Advice advice = new Advice();

        //返回值 动态生成的代理对象  基于jdk
        TargetInterface proxy = (TargetInterface) Proxy.newProxyInstance(
                //目标对象类加载器
                target.getClass().getClassLoader(),
                //目标对象相同的接口字节码对象数组
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    //调用代理对象的任何方法，实质执行的都是invoke方法
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //前置增强
                        advice.before();
                        //执行目标方法
                        Object invoke = method.invoke(target, args);
                        //后置增强
                        advice.afterReturning();
                        return invoke;
                    }
                }
        );

        //执行目标方法
        proxy.save();

    }

}
