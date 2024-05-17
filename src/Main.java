import java.util.Scanner;

public class Main {

    // initialize default range for guessing
    static int min = 0;
    static int max = 100;

    public static void main(String[] args) {

        //asking user for guessing game range
        System.out.println("State the number from where you want to start the guessing range: ");
        Scanner scanner = new Scanner(System.in);
        min = scanner.nextInt();
        System.out.println(min);

        System.out.println("State the number from where you want to end the guessing range: ");
        max = scanner.nextInt();
        System.out.println(max);

        //error checking if range is same
        if (min == max) {
            System.out.println("Minimum and maximum value cannot be same!");
            System.exit(0);
        }

        //getting random number from another class
        randomNumReturn rand= new randomNumReturn();
        int randomWinningNumber=rand.randomNumGenerator(min,max);
        System.out.println(randomWinningNumber);

        //logic of the game
        while (true) {
            System.out.println("Enter your guess: ");
            int userGuess= scanner.nextInt();

            if (userGuess==randomWinningNumber){
                System.out.println("Correct! You won!");
                break;
            } else if (randomWinningNumber>userGuess){
                System.out.println("Nope! The number is higher. Try again.");
            } else{
                System.out.println("Nope! The number is lower. Try again.");
            }
        }
        scanner.close();
    }
}