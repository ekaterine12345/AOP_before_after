package com.example.spr_aop_1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SamplePojo {
    private String name;
    private int age;

    public void doSomething() {
        System.out.println(this.name +" is doing something");
    }
}
