import java.util.Scanner;

public class NewToungeWeight
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight of trailer: ");
        double trailerWeight = input.nextDouble();

        System.out.print("Enter weight of cargo: ");
        double cargoWeight = input.nextDouble();

        printRange(trailerWeight, cargoWeight);
    }

    public static void printRange(double trailer, double cargo)
    {
        double totalWeight = trailer + cargo;
        double maxWeight = totalWeight * 0.15;
        double minWeight = totalWeight * 0.09;

        System.out.printf("Maximum tongue weight: %.2f\n", maxWeight);
        System.out.printf("Minimum tongue weight: %.2f", minWeight);
    }
}
