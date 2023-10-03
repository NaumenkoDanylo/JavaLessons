package HW3;

public class HelloWorld {
    public static void main(String[] args){
        String helloWorld = "Hello world!";
        System.out.println(helloWorld.charAt(0));
        System.out.println(helloWorld.charAt(helloWorld.length() - 1));

        String[] arrayOfWords = helloWorld.split(" ");
        String wordWorld = arrayOfWords[1];

        char[] arrayOfChars = new char[wordWorld.length() - 1];
        wordWorld.getChars(0, wordWorld.length() - 1, arrayOfChars, 0);
        for (char letter : arrayOfChars) {
            System.out.print(letter);
        }
        System.out.println();
        System.out.println(arrayOfChars[arrayOfChars.length - 2]);
    }
}
