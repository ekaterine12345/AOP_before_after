package com.example.spr_aop_1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.spr_aop_1.SampleClass.*(..))")  // pointcut expression
    public void beforeMethodExecution() {
        System.out.println("Before method execution");
    }

    @After("execution(* com.example.spr_aop_1.SampleClass.*(..))")
    public void afterMethodExecution() {
        System.out.println("After method execution");
    }

    @Before("execution(* com.example.spr_aop_1.SampleClass.doSomething(..))")
    public void myBefore(){
        System.out.println("my Before - doSomething");
    }


    @Before("execution(* com.example.spr_aop_1.SampleClass.*(int)) && args(number)")
    public void beforeMethodWithIntParameter(int number) {
        System.out.println("Before executing a method with int parameter. Number: " + number);
    }


    @After("execution(* com.example.spr_aop_1.SampleClass.*(String)) && args(text)")
    public void afterMethodWithStringParameter(String text) {
        System.out.println("After executing a method with String parameter. Text: " + text);
    }

    @Before("execution(int com.example.spr_aop_1.SampleClass.sum(int, int)) && args(a, b)")
    public void beforeSumExecution(int a, int b){
        System.out.println(a+"; "+b);
    }

//    @Before("execution(int com.example.spr_aop_1.SampleClass.sum(int, int)) && args(a, b)")
//    public void beforeSumMethod(int a, int b) {
//        System.out.println("Before executing the sum() method. Parameters: a = " + a + ", b = " + b);
//    }


    @Before("execution(* com.example.spr_aop_1.SamplePojo.doSomething())")
    public void beforePOJO(){
        System.out.println("before pojo");
    }

    @After("execution(* com.example.spr_aop_1.SamplePojo.doSomething())")
    public void afterPOJO(){
        System.out.println("after pojo");
    }
}


