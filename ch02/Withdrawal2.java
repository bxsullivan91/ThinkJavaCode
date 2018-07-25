public class Withdrawal2
{
    public static void main(String[] args)
    {
        int withdrawal = 137;

        int twenties = withdrawal / 20;
        int remainder = withdrawal % 20;

        int tens = remainder / 10;
        remainder = remainder % 10;

        int fives = remainder / 5;
        remainder = remainder % 5;

        int ones = remainder / 1;

        System.out.println("Number of twenties: " + twenties);
        System.out.println("Number of tens: " + tens);
        System.out.println("Number of fives: " + fives);
        System.out.println("Number of ones: " + ones);

        double fee = 0.10 * (twenties + tens + fives + ones) + 1;
        System.out.println("Convenience Fee: " + fee);

    }
}
