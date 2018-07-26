import java.util.Random;
import java.util.Scanner;

public class Employee
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int birthYear = 1998;
        boolean isUnionMember = true;
        String firstName = "Sigh";
        String middleName = "Lent";
        String lastName = "Tee";
        int employeeNumber;

        printHeader();

        System.out.println("Please enter your 5 digit employee number: ");
        employeeNumber = scanner.nextInt();

        printFullName(firstName, middleName, lastName);

        printUnionStatus(isUnionMember);

        printAge(birthYear);

        printEvenOrOdd(employeeNumber);

        printGeneratedSecretPassword(employeeNumber);
    }

    public static void printHeader()
    {
        System.out.println("Welcome to the WallabyTech Employee Application");
        System.out.println("===============================================");
    }

    public static void printFullName(String firstN, String middleN, String lastN)
    {
        System.out.print(lastN + ", ");
        System.out.print(firstN + " ");
        System.out.println(middleN);
    }

    public static void printUnionStatus(boolean tOrF)
    {
        System.out.println("Your union status is: " + tOrF);
    }

    public static void printAge(int yearBorn)
    {
        int currentYear = 2018;
        int employeeAge = currentYear - yearBorn;
        System.out.println("Your age is: " + employeeAge);
    }

    public static void printEvenOrOdd(int evenOdd)
    {
        int evenOddMath = evenOdd % 2;
        System.out.print("Employee number is even/odd (1=odd, 0=even);");
        System.out.println(evenOddMath);
    }

    public static void printGeneratedSecretPassword(int empNumber)
    {
        // pick a random number
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        int password = (empNumber + randomNumber) * 5;

        System.out.println("Employee's random secret pw is: " + password);
    }
}
