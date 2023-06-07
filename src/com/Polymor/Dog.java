package com.Polymor;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
        say();
    }

    public void say() {
        System.out.println("实例化狗狗类");
    }
}
