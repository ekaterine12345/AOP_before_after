package com.example.spr_aop_1;


import org.springframework.stereotype.Component;

@Component // annotation that allows Spring to detect our custom beans automatically
public class SampleClass {

    public void doSomething() {
        System.out.println("Doing something");
    }

    public void doAnything(){
        System.out.println("Do anything!");
    }

    public void printNumber(int number){
        System.out.println("Parameter number is " + number);
    }

    public void printString(String text){
        System.out.println("Parameter text is  " + text);
    }

    public int sum(int a, int b){
        return a+b;
    }
}

