import java.util.Scanner;

public class HighSpeed
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String stateCode;
        int speedEntered;

        System.out.print("Enter your state code (IA, MO, or AR):  ");
        stateCode = input.next();

        System.out.print("Enter your internet speed(M):  ");
        speedEntered = input.nextInt();

        System.out.print("Upgrade(if available): ");
        upgradeDetermination(stateCode, speedEntered);

    }

    public static void upgradeDetermination(String state, int speed)
    {
        if (state.equals("IA"))
        {
            if (speed < 30)
            {
                System.out.println("Free Upgrade to 50M");
            }
            else
            {
                System.out.println("No upgrade available");
            }
        }
        if (state.equals("MO"))
        {
            if (speed < 10)
            {
                System.out.println("Free upgrade to 20M");
            }
            else if ((speed < 25) && (speed >= 10))
            {
                System.out.println("Free upgrade to 50M");
            }
            else
            {
                System.out.println("No upgrade available");
            }

        }
        if (state.equals("AR"))
        {
            System.out.println("No upgrade available");
        }
    }
}
