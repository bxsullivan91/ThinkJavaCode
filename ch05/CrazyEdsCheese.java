import java.util.Scanner;

public class CrazyEdsCheese
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int sizeCheese;
        int yardsCheese;

        System.out.println("----------------------------------------");
        System.out.println("~~~Crazy Ed's Wholesale String Cheese~~~");
        System.out.println("----------------------------------------");
        System.out.println("Our cheese comes in three sizes: 1in, 2in, and 3 in!");
        System.out.print("Enter the size of cheese you would like: ");
        sizeCheese = input.nextInt();

        System.out.print("Enter the number of yards of cheese: ");
        yardsCheese = input.nextInt();

        cheesePrice(sizeCheese, yardsCheese);
    }

    public static void cheesePrice(int size, int yards)
    {
        int handling = 5;
        int priceOfCheese;

        if (size == 1)
        {
            if (yards < 50)
            {
                int shippingPerYard = 2;
                int costPerYard = 2;
                priceOfCheese = (costPerYard * yards) + (shippingPerYard * yards) + handling;
                System.out.println("Price of your cheese: " + "$ " + priceOfCheese);
            }
            else
            {
                int costPerYard = 2;
                priceOfCheese = (costPerYard * yards) + handling;
                System.out.println("Price of your cheese: " + "$" + priceOfCheese);
            }
        }

        else if (size == 2)
        {
            if (yards < 75)
            {
                int shippingPerYard = 2;
                int costPerYard = 4;
                priceOfCheese = (costPerYard * yards) + (shippingPerYard * yards) + handling;
                System.out.println("Price of your cheese: "+ "$" + priceOfCheese);
            }
            else
            {
                int costPerYard = 4;
                priceOfCheese = (costPerYard * yards) + handling;
                System.out.println("Price of your cheese: " + "$" + priceOfCheese);
            }
        }

        else if (size == 3)
        {
            if (yards < 25)
            {
                int shippingPerYard = 4;
                int costPerYard = 6;
                priceOfCheese = (costPerYard * yards) + (shippingPerYard * yards) + handling;
                System.out.println("Price of your cheese: "+ "$" + priceOfCheese);
            }
            else
            {
                int costPerYard = 6;
                priceOfCheese = (costPerYard * yards) + handling;
                System.out.println("Price of your cheese: "+ "$" + priceOfCheese);
            }
        }

        else
        {
            System.out.println("Your order is too crazy!!");
        }
    }


}
