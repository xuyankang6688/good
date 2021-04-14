package com.cn.fs.Utils;

import com.cn.fs.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: xyk
 * @Date: 2021/4/2 20:59
 */
public class ReflectDemo4 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Person> personClass = Person.class;
        Method cat = personClass.getMethod("eat");
        Person person= new Person();
        cat.invoke(person);
        Method eat = personClass.getMethod("eat", String.class);
        String name = eat.getName();
        System.err.println(name);
        eat.invoke(person,"大米饭");

    }
}
