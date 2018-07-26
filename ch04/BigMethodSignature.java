public class BigMethodSignature
{
    public static void main(String[] args)
    {
        printSum(5, 6, 7, 8, 9 , 10, 11, 12, 13, 14);
        printSum(25, 25, 25, 25, 25, 25, 25, 25, 25, 25);
    }

    public static void printSum(int one, int two, int three, int four, int five, int six, int seven, int eight, int nine, int ten)
    {
        System.out.println(one + two + three + four + five + six + seven + eight + nine + ten);
    }
}
