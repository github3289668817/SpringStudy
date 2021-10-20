package per.xgt.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/10/20 14:40
 */
public class MyAspect {

    public void before(){
        System.out.println("aop 前置通知......");
    }

    public void afterReturning(){
        System.out.println("aop 后置通知......");
    }

    /**
     *
     * @param pjp 正在执行的连接点--切点
     */
    public Object around(ProceedingJoinPoint pjp){
        Object proceed = new Object();
        System.out.println("aop 环绕前通知......");
        try {
            proceed = pjp.proceed();
        } catch (Throwable throwable) {
            System.out.println("aop 环绕通知异常......");
        }
        System.out.println("aop 环绕后通知......");
        return proceed;
    }

    public void afterThrowing(){
        System.out.println("aop 异常抛出通知......");
    }

    public void after(){
        System.out.println("aop 最终通知......");
    }

}
