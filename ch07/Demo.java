public class Demo
{
    public static void main(String[] args)
    {
        int i = 1;
        int sum = 10;

        while (i <= 10)
        {
            System.out.println(i + " " + sum);
            i++;
            sum = sum + 10;
        }

        i = 100;
        sum = 10;

        System.out.println("Starting do while loop!");

        do
        {
            System.out.println(i);
            i++;
        } while (i <= 10);

        System.out.println("Starting for loop");

        for (int j = 1; j <= 10; j++)
        {
            System.out.println(j);
        }
    }
}