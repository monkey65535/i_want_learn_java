package com.Use;
public class UseTest {
    public static void main(String[] args) {
        System.out.println("这是同包访问UseA");
        UseA usea = new UseA();
        System.out.println("这是同包访问UseB");
        UseB useb = new UseB();
        useb.say();
    }
}
