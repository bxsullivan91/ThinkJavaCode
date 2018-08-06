import java.util.Scanner;

public class VendingMachine
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        printMenu();

        int selection;
        System.out.print("Your selection: ");
        selection = input.nextInt();
        System.out.println();

        printSales(selection);


    }

    public static void printMenu()
    {

        System.out.println("Please Select From:");

        String[] menuItems = new String[3];
        menuItems[0] = "Freeze Dried Sushi";
        menuItems[1] = "Spock's Brain Blast";
        menuItems[2] = "Alien Asparagus";

        int itemNumber;

        for (int i = 0; i < menuItems.length; i++)
        {
            itemNumber = i;
            System.out.println(itemNumber + ") \t" + menuItems[i]);
        }

    }

    public static void printSales(int selection)
    {
        Scanner input = new Scanner(System.in);

        int[] totals = new int[3];

        while (selection != 99)
        {
            int[] orderCount = new int[3];

            if (selection == 0)
            {
                System.out.println("Thank you for choosing Freeze Dried Sushi");
                orderCount[0]++;
                totals[0]++;
            }
            if (selection == 1)
            {
                System.out.println("Thank you for choosing Spock's Brain Blast");
                orderCount[1]++;
                totals[1]++;
            }
            if (selection == 2)
            {
                System.out.println("Thank you for choosing Alien Asparagus");
                orderCount[2]++;
                totals[2]++;
            }

            System.out.println(orderCount[0] + " of Freeze Dried Sushi");
            System.out.println(orderCount[1] + " of Spock's Brain Blast");
            System.out.println(orderCount[2] + " of Alien Asparagus");

            System.out.println();
            printMenu();
            System.out.print("Your selection: ");
            selection = input.nextInt();
        }

        if (selection == 99)
        {
            System.out.println();
            System.out.println("Final Sales Totals: ");
            System.out.println(totals[0] + " of Freeze Dried Sushi");
            System.out.println(totals[1] + " of Spock's Brain Blast");
            System.out.println(totals[2] + " of Alien Asparagus");

        }


    }
}
