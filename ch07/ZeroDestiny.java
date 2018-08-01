import org.w3c.dom.css.Counter;

import java.util.Scanner;

public class ZeroDestiny
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your guess here --->  ");
        int yourNumber = input.nextInt();

        int count = 0;
        count = (youMustEnterZero(yourNumber));

        System.out.println("You entered a number other than zero " + count + " number of times.");

    }

    public static int youMustEnterZero(int n)
    {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int k = n;
        while (k > 0)
        {
            System.out.print("Enter another number --->  ");
            k = input.nextInt();
            count = count + 1;
        }

        System.out.println("You entered zero!!!!");

        return count;


    }
}
