package HW3;

import java.util.Arrays;

public class ArrayWords {
    public static void main(String[] args) {
        String text = "Мама мила раму.";
        String[] arrayToCrate = text.split(" ");
        //System.out.println(arrayToCrate);
        String stringToReplace = "Я хочу перенесення рядків.";
        System.out.println(stringToReplace.replace(' ', '\n'));

    }
}