import java.util.Scanner;

public class PetNames
{
    public static void main(String[] args)
    {

        receivePetNames();

    }

    public static void receivePetNames()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("How many pets do you have?");
        int petNumber = input.nextInt();

        String[] petNames = new String[petNumber];

        System.out.println("What are your pets names?");
        input.nextLine();

        for (int i = 0; i < petNames.length; i++)
        {
            petNames[i] = input.nextLine();
        }

        System.out.println("Your pets name's are: ");

        for (int j = 0; j < petNames.length; j++)
        {
            System.out.println(j + " " + petNames[j]);
        }
    }
}
