package HW2;
//задача 2
public class IntSwapWithVariable {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + " b = " + b);
    }
}