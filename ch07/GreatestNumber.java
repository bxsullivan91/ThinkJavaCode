import java.util.Random;
import java.util.Scanner;

public class GreatestNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Your Name: ");
        String yourName = input.next();

        int numberOfGuesses;
        numberOfGuesses = guessNumber();


        System.out.println("Congrats, " + yourName + "!!!");

        playAgain();

    }

    public static int guessNumber()
    {
        Random randomNumber = new Random();
        Scanner input = new Scanner(System.in);

        System.out.print("Please Guess A Number: ");
        int yourGuess = input.nextInt();

        int random = randomNumber.nextInt(100) + 1;
        int guesses = 0;

        while (random != yourGuess)
        {

            if (yourGuess > random)
            {
                System.out.println("You are high");
            }
            else if (yourGuess < random)
            {
                System.out.println("You are low");
            }

            System.out.print("Please Guess Again: ");
            yourGuess = input.nextInt();
            guesses++;

        }
        if (random == yourGuess)
        {
            System.out.println("You are correct");
            guesses++;
        }

        System.out.println("You guessed " + guesses + " times!");

        return guesses;
    }

    public static void playAgain()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Do you want to play again? Type 'yes' or 'no'.");
        String playAgainAnswer = input.next();

        int gamesPlayed = 1;

        while (playAgainAnswer.equals("yes"))
        {

            guessNumber();
            System.out.println("Do you want to play again? Type 'yes' or 'no'.");
            playAgainAnswer = input.next();
            gamesPlayed++;
        }

        System.out.println("You played " + gamesPlayed + " games");

    }

}
