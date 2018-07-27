public class SwitchExample
{
    public static void main(String[] args)
    {
        lastNameWinner("Wah");

        dayOfWeek(6);
    }

    public static void lastNameWinner(String lastName)
    {
        switch (lastName)
        {
            case "Smith":
            case "Jones":
                System.out.println("Congratulations, grand winner");
                break;

            case "Lazenby":
                System.out.println("Hey, he owes me dinner");
                break;

            default:
                System.out.println("Sorry, not a winner");
        }
    }

    public static void dayOfWeek(int weekDay)
    {
        switch (weekDay)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid value: " + weekDay);

        }
    }
}
