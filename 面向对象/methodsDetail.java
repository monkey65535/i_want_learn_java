public class methodsDetail {
    public static void main(String[] args) {
        AA a = new AA();
        a.printString(4, 5, "#");
    }
}

class AA {
    public int[] getSumAndSub(int n1, int n2) {
        int[] res = new int[2];
        res[0] = n1 + n2;
        res[1] = n1 - n2;
        return res;
    }

    public void print() {
        System.out.println("pring ln");
    }

    public void say() {
        print();
        BB b = new BB();
        b.hi();
    }

    public boolean isOdd(int num) {
        return (num % 2) == 0;
    }

    public void printString(int row, int col, String str) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(str);
            }
            System.out.println("");
        }
    }
}

class BB {
    public void hi() {
        System.out.println("pring hi");
        sayhi();
    }

    private void sayhi() {
        System.out.println("pring sayhi");
    }
}