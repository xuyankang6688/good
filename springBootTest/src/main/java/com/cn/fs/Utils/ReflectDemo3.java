package com.cn.fs.Utils;

import com.cn.fs.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author: xyk
 * @Date: 2021/4/2 20:59
 */
public class ReflectDemo3 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Person> personClass = Person.class;
        Constructor constructor = personClass.getConstructor(String.class,Integer.class);
        System.out.println(constructor);
        Object zhangsan_ = constructor.newInstance("zhangsan ", 1);
        System.out.println(zhangsan_);
    }
}
