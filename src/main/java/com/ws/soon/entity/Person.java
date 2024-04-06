package com.ws.soon.entity;

import java.util.Date;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Person {
    private String name;//姓名
    private int age;//年龄
    private String className;//所在班级
    private School school;
    private Double dous;

    private Date date;

    private Date ldate;
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, String className) {
        this.name = name;
        this.className = className;
    }

}
