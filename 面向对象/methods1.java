public class methods1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.speak();
    }
}

class Person {
    String name;
    int age;
    public void speak(){
        System.out.println("我是一个好人");
    }
}
