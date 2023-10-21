package HW4;


import java.util.Arrays;

public class ArrayWithTenNum {
    public static void main(String[] args) {

        int[] arrayOfIntegers = new int[]{96, 16, 44, 38, 3, 21, 127, 64, 12, 1};
        System.out.println("Min Int = " + Arrays.stream(arrayOfIntegers).min());
        System.out.println("Max Int = " + Arrays.stream(arrayOfIntegers).max());

    }
}
