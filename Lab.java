import java.util.Scanner;

public class Lab {
    public static Scanner scanner = new Scanner(System.in);

    public static String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getIntInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        // Your code goes here
        // Use getInput("Enter something: ") for strings
        // Use getIntInput("Enter a number: ") for integers

        // Example usage:
        // String name = getInput("What's your name? ");
        // int age = getIntInput("What's your age? ");
        // System.out.println("Hello " + name + ", you are " + age + " years old.");
        System.out.println("Problem 1: Temp Converter");

        int tempF = getIntInput("Enter temperature in Fahrenheit: ");
        int tempC = (tempF - 32) * 5/9;

        System.out.println(tempF + " in celsius is " + tempC);

    }
}
