package per.xgt.aopAnno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author Valen
 * @version V1.0
 * @date 2021/10/20 14:40
 */
@Component("myAspect")
@Aspect//标注当前myAspect是一个切面类
public class MyAspect {

    //配置前置通知
    @Before("execution(* per.xgt.aopAnno.*.*(..))")
    public void before() {
        System.out.println("aop 前置通知......");
    }

    @AfterReturning("execution(* per.xgt.aopAnno.*.*(..))")
    public void afterReturning() {
        System.out.println("aop 后置通知......");
    }

    //@Around("execution(* per.xgt.aopAnno.*.*(..))")
    //@Around("pointcut()")
    @Around("MyAspect.pointcut()")
    public Object around(ProceedingJoinPoint pjp) {
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

    @AfterThrowing("execution(* per.xgt.aopAnno.*.*(..))")
    public void afterThrowing() {
        System.out.println("aop 异常抛出通知......");
    }

    @After("execution(* per.xgt.aopAnno.*.*(..))")
    public void after() {
        System.out.println("aop 最终通知......");
    }

    //定义切点表达式
    @Pointcut("execution(* per.xgt.aopAnno.*.*(..))")
    public void pointcut(){}

}
