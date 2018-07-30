import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        printGreeting("HELLO");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter a number: ");
        int secondNumber = input.nextInt();

        //int total = firstNumber + secondNumber;
        //System.out.println("The total is " + total);

        int myTotal = getTotal(firstNumber, secondNumber);
        System.out.println("The total is: " + myTotal);
    }

    public static int getTotal(int number1, int number2)
    {
        int total = number1 + number2;
        return total;
    }

    public static void printGreeting(String greeting)
    {
        System.out.println("<<<" + greeting + ">>>");
    }
}
