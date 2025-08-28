import java.util.Scanner;

public class Problem3 {
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
        System.out.println("Problem 3: Num Guessing Game");
      
        int answer = 97;
        System.out.println("You have 5 Guesses!");
      
        for(int i = 0; i < 5; i++){
            int guess = getIntInput("Guess the number between 1 and 100: ");
            if (guess > answer){
                System.out.println("To high!");
            } else if (guess < answer){
                System.out.println("To Low!");
            } else if (guess == answer) {
                System.out.println("Correct!");
                break;
            }
        }



    }
}
