public class Withdrawal
{
    public static void main(String[] args)
    {
        int withdrawal = 137;

        int twenties = 0;
        twenties = withdrawal / 20;
        System.out.print("Number of Twenties: ");
        System.out.println(twenties);

        int tens = 0;
        tens = twenties * 20;
        tens = withdrawal - tens;
        tens /= 10;
        System.out.print("Number of Tens: ");
        System.out.println(tens);

        int fives = 0;
        fives = twenties * 20;
        fives += tens * 10;
        fives = withdrawal - fives;
        fives /= 5;
        System.out.print("Number of Fives: ");
        System.out.println(fives);

        int ones = 0;
        ones = twenties * 20;
        ones += tens * 10;
        ones += fives * 5;
        ones = withdrawal - ones;
        ones /= 1;
        System.out.print("Number of Ones: ");
        System.out.println(ones);

        final int transactionFee = 1;
        double otherFee = 0.00;
        otherFee = ones + fives + tens + twenties;
        otherFee *= 0.10;
        otherFee += transactionFee;
        System.out.print("Total Convenience Fee: ");
        System.out.println(otherFee + "0");

    }
}
 /*int withdrawal = 137;
        double fee;
        int twenties = withdrawal / 20;
        int remainder = withdrawal % 20;
        int tens = remainder / 10;
        remainder = remainder % 10;
        int fives = remainder / 5;
        remainder = remainder % 5;
        int ones = remainder / 1;
        fee = 0.10 * ( twenties + tens + fives + ones ) ;
        */