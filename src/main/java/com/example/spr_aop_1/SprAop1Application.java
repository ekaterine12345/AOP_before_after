package com.example.spr_aop_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SprAop1Application implements CommandLineRunner {

    @Autowired
    private SampleClass sampleClass;

    @Autowired
    private SamplePojo samplePojo;

    public static void main(String[] args) {
        SpringApplication.run(SprAop1Application.class, args);
    }

    @Override
    public void run(String... args) {
    //    sampleClass.doSomething();
     //   sampleClass.doAnything();
       // sampleClass.printNumber(100);
      //  sampleClass.printString("Congratulations!");
 //      int my_sum = sampleClass.sum(100, 200);
  //      System.out.println("sum = " + my_sum+"\n\n");
//
        samplePojo.setName("John");
        samplePojo.setAge(25);
        System.out.println("Name: " + samplePojo.getName()
                + "\nAge: " + samplePojo.getAge());
        samplePojo.doSomething();
    }
}

