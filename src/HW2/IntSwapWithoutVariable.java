package HW2;
//задача 3
public class IntSwapWithoutVariable {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + " b = " + b);
    }
}