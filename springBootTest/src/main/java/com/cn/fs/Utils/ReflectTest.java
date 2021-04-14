package com.cn.fs.Utils;

import com.cn.fs.domain.Person;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author: xyk
 * @Date: 2021/4/2 20:59
 */
public class ReflectTest {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, IOException, ClassNotFoundException {
        //加载配置文件
        //创建properties对象
        Properties properties = new Properties();
        //加载配置文件转换为一个集合
        //获取class目录文件的方式
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("application.properties");
        properties.load(is);

        //获取文件中定义的数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        System.err.println(className+"-------"+methodName);

        //加载该类进内存
        Class<?> aClass = Class.forName(className);
        //创建对象
        Object o = aClass.newInstance();
        //获取方法对象
        Method method = aClass.getMethod(methodName);
        method.invoke(o);


    }
}
