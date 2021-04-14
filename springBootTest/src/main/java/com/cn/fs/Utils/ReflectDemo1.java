package com.cn.fs.Utils;

import com.cn.fs.domain.Person;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

/**
 * @author: xyk
 * @Date: 2021/4/1 21:17
 */
public class ReflectDemo1 {
    /*
     *获取.class的三种方式
     */
    public static void main(String[] args) throws ClassNotFoundException {
        //1.Class.forName("全类名")
        Class aClass1 = Class.forName("com.cn.fs.domain.Person");
        System.err.println(aClass1);
        //2.类名.class
        Class aClass2 = Person.class;
        System.err.println(aClass2);

        //对象.getClass（）
        Person person = new Person();
        Class aClass3 = person.getClass();
        System.err.println(aClass3);
        System.err.println(aClass1==aClass3);
        System.err.println(aClass2==aClass3);
        System.err.println(aClass2==aClass1);

    }

}
