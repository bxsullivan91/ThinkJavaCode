public class MathUtil
{
    public static void main(String[] args)
    {
        printDifference(1000, 4000000);
    }

    public static void printDifference(int firstValue, int secondValue)
    {
        int difference = firstValue - secondValue;
        System.out.println(difference);
        printAbsValue(difference);
    }

    public static void printAbsValue(int realValue)
    {
        int absValue = Math.abs(realValue);
        System.out.print("Value is: " + realValue);
        System.out.println(" and abs value is: " + absValue);
    }
}
