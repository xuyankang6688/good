package com.cn.fs.Utils;

import com.cn.fs.domain.Person;

import java.lang.reflect.Field;

/**
 * @author: xyk
 * @Date: 2021/4/1 21:45
 */
public class ReflectDemo2 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //1.获取personclass对象
        Class personClass = Person.class;
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.err.println(field);
        }
        System.err.println("------------------------");
        Field a = personClass.getField("a");
        //获取成员变量a的值
        Person person = new Person();
        Object o = a.get(person);
        System.err.println(o);
        a.set(person,"张三");
        System.err.println(person);

        System.err.println("------------------------");
        Field[] declaredFields = personClass.getDeclaredFields();

        for (Field declaredField : declaredFields) {
            System.err.println(declaredField);
        }
        Field a1 = personClass.getDeclaredField("a");
        a1.setAccessible(true);
        Object o1 = a1.get(person);
        System.err.println(o1);
        System.err.println(o+"===========");


    }
}
