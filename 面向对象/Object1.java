public class Object1 {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 12;
        cat1.color = "#ffffff";

        Car car1 = new Car();
        car1.name = "123";
        car1.price = 12.22;
        car1.color = "#f00";
        car1.master = {"aaa","bbb"};
    }
}

class Cat {
    String name;
    int age;
    String color;
}

class Car {
    String name;
    double price;
    String color;
    String master[];
}