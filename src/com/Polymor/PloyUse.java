package com.Polymor;

public class PloyUse {
    public static void main(String[] args) {
        AnimalMaster animalMaster = new AnimalMaster("TomCat");
        Dog dog = new Dog("柴犬");
        DogFood dogFood = new DogFood("不给吃的");

        Cat cat = new Cat("布偶");
        CatFood catFood = new CatFood("猫粮");
        animalMaster.createAnimal(dog, dogFood);
        animalMaster.createAnimal(cat, catFood);
    }

}
