package com.Use;

public class UseA {
    public String n1 = "这个属性是Public";
    protected String n2 = "这个属性是protected";
    String n3 = "这个属性是默认";
    private String n4 = "这个属性是private";

    public void usePrint() {
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}
