package HW3;

public class ArrayNumbers {
    public static void main(String[] args) {
//        #1
        int[] intNumbers;
        intNumbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10,};
        for (int value : intNumbers) {
            System.out.println(value);
        }
//        #2
        double doubleNumbers[] = new double[]{1.1, 2.2, 3.3, 4.4, 5.5};
        for (double value : doubleNumbers) {
            System.out.println(value);

        }
//        #3
        byte byteVariable = Byte.MAX_VALUE;
        int intVariable = Integer.MAX_VALUE;
        long longVariable = Long.MAX_VALUE;
        int[] integerArrays = new int[]{byteVariable, intVariable, (int) longVariable,};//- data lost in longVariable
        for (int value : integerArrays) {
            System.out.println(value);
        }
//        #4
        int[][] arrayOfInts = new int[10][10];
        int value = 0;
        for (int indexOfFirstArray = 0; indexOfFirstArray < arrayOfInts[1].length; indexOfFirstArray++) {
            for (int indexOfSecondArray = 0; indexOfSecondArray < arrayOfInts[2].length; indexOfSecondArray++) {
                arrayOfInts[indexOfFirstArray][indexOfSecondArray] = value++;
            }
            value = 0;

        }
    }
}