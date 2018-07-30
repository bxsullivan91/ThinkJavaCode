public class MathUtil
{
    public static void main(String[] args)
    {
        int value = getTotal(12, 12);
        System.out.print("The Value is: " + value + "\n");

        double interior = getCargoVoluem(10.5, 12.5, 15.5, true);
        System.out.println("The Interior Volume is: " + interior + " cubic inches");

        int sumTest = absoluteSum(0, -1);
        System.out.println("The absolute sum is: " + sumTest);

        int newSum = absoluteSum(1, 2, -5);
        System.out.println("The other absolute sum is: " + newSum);
    }

    public static int getTotal(int firstNumber, int secondNumber)
    {
        int total = firstNumber + secondNumber;
        return total;
    }

    public static double getCargoVoluem(double height, double length, double depth, boolean heavyDuty)
    {
        double materialThickness;

        if (heavyDuty)
        {
            materialThickness = 0.25 * 2 * 2;
        }
        else
        {
            materialThickness = 0.25 * 2;
        }

        double newHeight = height - materialThickness;
        double newLength = length - materialThickness;
        double newDepth = depth - materialThickness;
        double intVolume = newHeight * newLength * newDepth;

        return intVolume;
    }

    public static int absoluteSum(int argument1, int argument2)
    {
        int absArg1 = Math.abs(argument1);
        int absArg2 = Math.abs(argument2);

        int sum = absArg1 + absArg2;
        return sum;
    }

    public static int absoluteSum(int number1, int number2, int number3)
    {
        int abs1 = Math.abs(number1);
        int abs2 = Math.abs(number2);
        int abs3 = Math.abs(number3);

        int sum = abs1 + abs2 + abs3;
        return sum;
    }
}
