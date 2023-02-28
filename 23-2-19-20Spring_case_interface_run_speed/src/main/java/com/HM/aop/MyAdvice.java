package com.HM.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.HM.service.*Service.*(..))")
    private void servicePt(){}

    @Around("MyAdvice.servicePt()")
    public void runSpeed(ProceedingJoinPoint joinPoint) throws Throwable {
        Signature signature = joinPoint.getSignature();
        String className = signature.getDeclaringTypeName();
        String methodName = signature.getName();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            Object proceed = joinPoint.proceed();
        }
        long end = System.currentTimeMillis();

        long time=end-start;
        System.out.println(methodName+"接口万次运行耗费时间---->"+time+"ms");
    }
}
