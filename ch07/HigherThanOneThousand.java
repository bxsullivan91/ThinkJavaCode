import java.util.Scanner;

public class HigherThanOneThousand
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int yourNumber;

        System.out.print("Please enter a number: ");
        yourNumber = in.nextInt();

        int totalCount;
        totalCount = getPastOneThousand(yourNumber);

        System.out.println("You've entered a total of " + totalCount + " to finally achieve a total greater than 1000!");

    }

    public static int getPastOneThousand(int numberEntered)
    {
        Scanner in = new Scanner(System.in);


        while (numberEntered < 1000)
        {
            System.out.print("Enter another number: ");
            numberEntered = in.nextInt() + numberEntered;
        }

        return numberEntered;
    }
}
