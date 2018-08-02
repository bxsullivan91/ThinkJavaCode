public class ArrayDemo
{
    public static void main(String[] args)
    {
        int[] printArrayElements = new int[3];
        printArrayElements[0] = 1;
        printArrayElements[1] = 5;
        printArrayElements[2] = 9;

        printArray(printArrayElements);

        int[] printArrayElements2 = {5, 2, 9, 8, 0};

        printArray(printArrayElements2);

        int[] bronzeSeven = new int[10];
        bronzeSeven[0] = 1;
        bronzeSeven[3] = 25;

        bronzeSeven[9] = 15;

        printArray(bronzeSeven);

        int[] tValues = {5, 7, 13};
        arrayTotal(tValues);

        int[] totalValues = {1, 5, 9};
        arrayTotal(totalValues);

        int[] maxValues = {5, 8, 21, 19, 74};
        arrayMax(maxValues);

        int[] maxArrayValues = {78, 23, 9, 34};
        arrayMaxIndex(maxArrayValues);

        double[] averageValues = {34.2, 18.0, 12.5, 13.1};
        arrayAverage(averageValues);

        String[] printWords = new String[10];
        printWords[0] = "Hi";
        printWords[3] = "Hello";
        printWords[9] = "Bye";
        printArray(printWords);

    }

    public static void printArray(int[] elements)
    {
        for (int values : elements)
        {
            System.out.println("printArray values: " + values);
        }

        for (int i = 0; i < elements.length; i++)
        {
            System.out.println("test : " + elements[i]);
        }
    }

    public static void printArray(String[] elements)
    {
        for (String values : elements)
        {
            System.out.println("printArray values: " + values);
        }

        for (int i = 0; i < elements.length; i++)
        {
            System.out.println("test : " + elements[i]);
        }

    }

    public static int arrayTotal(int[] values)
    {
        int total = 0;
        for (int i = 0; i < values.length; i++)
        {
            total = total + values[i];
        }

        System.out.println("The total is " + total);
        return total;
    }

    public static int arrayMax(int[] values)
    {
        int max = values[0];

        for (int i = 0; i < values.length; i++)
        {
            if (max < values[i])
            {
                max = values[i];
            }
        }

        System.out.println("The max number is " + max);

        return max;
    }

    public static int arrayMaxIndex(int[] values)
    {
        int max = values[0];
        int indexNumber = 0;

        for (int i = 0; i < values.length; i++)
        {

            if (max < values[i])
            {
                max = values[i];
                indexNumber = i;
            }

        }

        System.out.println("Max index number is: " + indexNumber);

        return max;
    }

    public static double arrayAverage(double[] values)
    {
        double total = 0;
        int numberOfIndex = 0;
        double average = 0;

        for (int i = 0; i < values.length; i++)
        {
            total += values[i];
            numberOfIndex++;
        }

        average = total / numberOfIndex;

        System.out.println("Average is: " + average);

        return average;

    }

}
