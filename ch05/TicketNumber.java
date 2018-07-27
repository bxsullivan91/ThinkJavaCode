import java.util.Scanner;

public class TicketNumber
{
    public static void main(String[] args)
    {
        int ticketNumber;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your ticket number below");
        ticketNumber = input.nextInt();

        int lastDigit = ticketNumber % 10;
        int ticketPrefix = ticketNumber / 10;
        int preRemainder = ticketPrefix % 7;

        boolean result = (lastDigit == preRemainder);

        if (result)
        {
            System.out.println("Good Number");
        }
        else
        {
            System.out.println("Bad Number");
        }

    }
}
