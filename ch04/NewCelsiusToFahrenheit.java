import java.util.Scanner;

public class NewCelsiusToFahrenheit
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter degrees in Celsius: ");
        double degreesEntered = input.nextDouble();

        printFahrenheit(degreesEntered);
        System.out.println();
        printKelvin(degreesEntered);
    }

    public static void printFahrenheit(double celsius)
    {

        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.printf("Degrees in Fahrenheit: %.1f", fahrenheit);

    }

    public static void printKelvin(double celsius)
    {
        double kelvin = celsius + 273.15;
        System.out.printf("Degrees in Kelvin: %.2f", kelvin);
    }
}