package com.example.AopDemo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AspectClass {
    @Pointcut("execution(public void show())")
    public void p1(){}

//    @Before("p1()")
//    public void beforeCalculator(){
//        System.out.println("Calculator....");
//    }
//    @After("p1()")
//    public void AfterCalculator(){
//        System.out.println("End Operation");
//    }
    @Around("p1()")
    public void aroundCalculator(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("Start Calculator");
        proceedingJoinPoint.proceed();
        System.out.println("Calculating....");
    }
    @AfterThrowing("execution(public int div())")
    public void exceptionDiv(){
        System.out.println("Not divide by zero");
    }
}
