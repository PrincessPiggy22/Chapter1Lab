import java.util.Scanner;

public class Problem2 {
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
        System.out.println("Problem 2: Grade Calculator");
        int frstScore = getIntInput("Enter first test score: ");
        int scndScore = getIntInput("Enter second test score: ");
        int thrdScore = getIntInput("Enter third test score: ");

        int scoreAv = (frstScore + scndScore + thrdScore) / 3;
        System.out.println("Your average is " + scoreAv);

        if (scoreAv >= 90){
            System.out.println("Your letter grade i a A");
        }else if (scoreAv >= 80 && scoreAv<= 89) {
            System.out.println("Your letter grade i a B");
        } else if (scoreAv >= 70 && scoreAv <= 79) {
            System.out.println("Your letter grade i a C");
        } else if (scoreAv >= 60 && scoreAv <= 69){
            System.out.println("Your letter grade i a D");
        } else if (scoreAv < 60) {
            System.out.println("Your letter grade i a F");
        }
    }
}
