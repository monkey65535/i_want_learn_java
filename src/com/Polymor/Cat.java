package com.Polymor;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        say();
    }

    public void say() {
        System.out.println("实例化猫猫类");
    }
}
