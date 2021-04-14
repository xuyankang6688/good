package com.cn.fs.domain;

/**
 * @author: xyk
 * @Date: 2021/4/1 21:20
 */
public class Person {

    private String name;

    private Integer age;

    public String a;
    protected Integer b;
     Integer c;
    private Integer d;
    public Person() {
    }
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }


    public void eat(){
        System.out.println("进入吃货的世界...........");
    }

    public void eat(String food){
        System.out.println("进入吃货的世界...........:"+food);
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }
}
