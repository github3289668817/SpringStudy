package per.xgt.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

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

        //返回值 动态生成的代理对象  基于cglib
        //1.创建增强器
        Enhancer enhancer = new Enhancer();
        //2.设置父类（目标）
        enhancer.setSuperclass(Target.class);
        //3.设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                //执行前置
                advice.before();
                //执行目标
                Object invoke = method.invoke(target, args);
                //执行后置
                advice.afterReturning();
                return invoke;
            }
        });
        //4.创建代理对象
        Target proxy = (Target) enhancer.create();

        proxy.save();
    }

}