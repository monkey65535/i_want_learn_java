package com.Polymor;

public class CatFood extends Food {
    public CatFood(String foodName) {
        super(foodName);
        manual();
    }

    public void manual() {
        System.out.println("调用猫粮");
    }
}
