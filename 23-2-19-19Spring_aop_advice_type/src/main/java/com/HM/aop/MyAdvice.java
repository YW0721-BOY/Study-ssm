package com.HM.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {
    @Pointcut("execution(void com.HM.dao.BookDao.update())")
    private void pt(){}
    @Pointcut("execution(int com.HM.dao.BookDao.select())")
    private void pt_s(){}
    //@Before("pt()")
    public void before(){System.out.println("before advice ……");}
    //@After("pt()")
    public void after(){System.out.println("after advice ……");}

    @Around("pt()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice……");
        pjp.proceed();
        System.out.println("around after advice……");
    }

    @Around("pt_s()")
    public Object aroundSelect(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around before advice……");
        Object proceed = pjp.proceed();
        System.out.println("around after advice……");
        return proceed;
    }

    public void afterReturning(){
        System.out.println("afterReturning advice ……");
    }
    public void afterThrowing(){
        System.out.println("afterThrowing advice ……");
    }
}
