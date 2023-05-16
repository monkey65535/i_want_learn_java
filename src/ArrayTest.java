import com.Use.UseA;

public class ArrayTest {
    public static void main(String[] args) {
        UseA useA = new UseA();
        System.out.println("在不同包下，可以访问的属性只有public修饰的属性或方法，但是不能访问protected 默认 private");
        System.out.println(useA.n1);
    }
}


class MyTools {
    public void bubble(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}