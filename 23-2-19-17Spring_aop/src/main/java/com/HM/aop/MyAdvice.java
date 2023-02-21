package com.HM.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(void com.HM.dao..*e())")
    private void pt(){}


    @Around("pt()")
    public void method(ProceedingJoinPoint pjp) throws Throwable {
        Long startTime =System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            pjp.proceed();
        }

        Long endTime =System.currentTimeMillis();

        Long totalTime = endTime-startTime;
        System.out.println("执行万次消耗时间： "+totalTime+"ms");
    }
}
