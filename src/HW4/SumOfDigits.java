package HW4;

import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number 25: ");
        int i = input.nextInt();
        System.out.println("The sum is: " + sumOfDigits(i));

    }

    private static int sumOfDigits(int number) {

        String[] representation = String.valueOf(number).split("");
        int sum = 0;
        for (int i = 0; i < representation.length; i++) {
            sum += Integer.parseInt(representation[i]);
        }
        return sum;
    }
}