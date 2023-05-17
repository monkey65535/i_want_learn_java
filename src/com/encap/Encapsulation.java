package com.encap;

public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jacky");
        person.setAge(3099);
        person.setSalary(30000);
        System.out.println(person.info());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    // IDEA快捷键 右键=> 生成 => Getters和Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄需要在1-120岁之间");
            this.age = 18;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "信息为 name=" + this.name + " age=" + this.age + " salary=" + this.salary;
    }
}
