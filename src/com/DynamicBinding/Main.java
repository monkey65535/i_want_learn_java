package com.DynamicBinding;

public class Main {
    public static void main(String[] args) {
        A b = new B();
        System.out.println(b.sum() + "b.sum");
        System.out.println(b.sum1() + "b.sum1");
        A c = new C();
        System.out.println(c.sum() + "c.sum use a.sum");
        System.out.println(c.sum1() + "c.sum1 ");
        Boolean isString = "aaabbb".equals("aaabbb");
    }
}
