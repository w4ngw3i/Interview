package com.wangwei.spring;

/**
 * @Auther wangwei
 * @Date 2018/5/17 下午6:51
 */
public class ResourceDemo {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println(ResourceDemo.class.getClassLoader());
        System.out.println(System.getProperty("java.ext.dirs"));
        String classPath = System.getProperty("java.class.path");
        System.out.println(classPath);
    }
}
