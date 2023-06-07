package com.Polymor;

public class DogFood extends Food {
    public DogFood(String foodName) {
        super(foodName);
    }

    public void manual() {
        System.out.println("调用狗粮");
    }
}
