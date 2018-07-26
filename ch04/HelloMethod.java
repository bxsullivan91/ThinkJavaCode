public class HelloMethod
{
    public static void main(String[] args)
    {
        String firstName = "Fred";
        String secondName = "Wilma";
        String lastName = "Flintstone";

        printHelloWorld(firstName, lastName);
        printHelloWorld(secondName, lastName);

        printOhNo(firstName, lastName, 5);

        printNumberNoSign(5);
        printNumberNoSign(-5);
    }

    public static void printHelloWorld(String fName, String lName)
    {
        System.out.println("Hello World " + fName + " " + lName);
    }

    public static void printOhNo(String nName, String pName, int firstNumber)
    {
        System.out.println("OHHHHH NOOOOOOO!!!!!" + nName + " " + "Mary" + " " + pName);
        System.out.println("First number is: " + firstNumber);
    }

    public static void printNumberNoSign(int number)
    {
        int positiveNumber = Math.abs(number);
        System.out.println("The number is " + positiveNumber);
    }
}
