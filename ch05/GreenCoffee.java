import java.util.Scanner;

public class GreenCoffee
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int commuteAnswer;
        int milesAnswer;

        System.out.println("How do you get to work?");
        System.out.print("Type 1=bus, 2=bike, 3=neither:  ");
        commuteAnswer = input.nextInt();

        System.out.print("How many miles do you travel?:  ");
        milesAnswer = input.nextInt();

        calculateDiscount(commuteAnswer, milesAnswer);

    }

    public static void calculateDiscount(int commuteType, int milesTraveled)
    {
        if (milesTraveled <= 21)
        {
            System.out.println("Your coffee is free!");
        }

        else if (commuteType == 1)
        {
            if (milesTraveled < 50 && milesTraveled > 35)
            {
                System.out.println("Your discount is: " + (30 + 20) + "%");
            }
            else if (milesTraveled < 35)
            {
                System.out.println("Your discount is: " + 30 + "%");
            }

        }
        else if (commuteType == 2)
        {
            if (milesTraveled < 30)
            {
                System.out.println("Your discount is: " + (20 + 10) + "%");
            }

            else if (milesTraveled > 30 && milesTraveled < 50)
            {
                System.out.println("Your discount is: " + 20 + "%");
            }

        }
        else
        {
            System.out.println("No discount for you, EARTH KILLER!");
        }
    }


}
