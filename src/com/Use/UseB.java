package com.Use;

public class UseB {
    public void say() {
        UseA usea = new UseA();
        // 在同一个包下，可以访问public protected和默认，不能访问private
        System.out.println("在同一个包下，可以访问public protected和默认，不能访问private");
        System.out.println(usea.n1);
        System.out.println(usea.n2);
        System.out.println(usea.n3);
        // System.out.println(usea.n4);
    }
}
