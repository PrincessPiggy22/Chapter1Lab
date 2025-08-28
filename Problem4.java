import java.util.Scanner;

public class Problem4 {
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
        System.out.println("Problem 4: Simple Quiz");
        System.out.println("Answer 3 questions correctly and win a special prize");

        int correctNum = 0;

        int a1 = 1025;
        int q1 = getIntInput("How many pokemon are in the National Pokedex? ");
        if (q1 == a1){
            System.out.println("Correct! :)");
            correctNum++;
        } else {
            System.out.println("Sorry, that's incorrect :(");
        }
        scanner.nextLine();

        int a2 = 1;
        int q2 = getIntInput("What is bulbasaur's dex number? ");
        if (q2 == a2){
            System.out.println("Correct! :)");
            correctNum++;
        } else {
            System.out.println("Sorry, that's incorrect :(");
        }

        System.out.println("Final Question!!!");
        int a3 = 260;
        int q3 = getIntInput("What is Skitty's Base stat total? ");
        if (q3 == a3){
            System.out.println("Correct! :)");
            correctNum++;
        } else {
            System.out.println("Sorry, that's incorrect :(");
        }

        if (correctNum == 3){
            System.out.println("You got all three questions correct! :)");
            System.out.println("You win Bragging Rights!!");
        } else if(correctNum == 1 || correctNum == 2){
            System.out.println("You got some of them right! Maybe try again?");
        } else {
            System.out.println("You failed.");
        }


    }
}
