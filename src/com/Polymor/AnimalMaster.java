package com.Polymor;

public class AnimalMaster {
    String name;

    public AnimalMaster(String name) {
        this.name = name;
    }

    public void createAnimal(Animal animal, Food food) {
        System.out.println(name + "创建了一只" + animal.name + ", 需要喂食" + food.foodName);
    }
}
