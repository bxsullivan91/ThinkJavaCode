public class LoopPractice
{
    public static void main(String[] args)
    {
        forOneToTen();
        whileOneToTen();
        doWhileOneToTen();
        forTenToOne();
        whileTenToOne();
        doWhileTenToOne();
        forByTens();
        whileByTens();
        doWhileByTens();
        forSequence();
        whileSequence();
        doWhileSequence();
        printOneToNumber(15);

    }

    public static void forOneToTen()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
    }

    public static void whileOneToTen()
    {
        int i = 1;
        while (i <= 10)
        {
            System.out.println(i);
            i++;
        }
    }

    public static void doWhileOneToTen()
    {
        int i = 1;
        do
        {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void forTenToOne()
    {
        for (int i = 10; i >= 1; i--)
        {
            System.out.println(i);
        }
    }
    public static void whileTenToOne()
    {
        int i = 10;
        while (i >= 1)
        {
            System.out.println(i);
            i--;
        }
    }
    public static void doWhileTenToOne()
    {
        int i = 10;
        do
        {
            System.out.println(i);
            i--;
        } while (i >= 1);
    }

    public static void forByTens()
    {

        for (int j = 0; j <= 100; j += 10)
        {
            System.out.println(j);
        }

    }

    public static void whileByTens()
    {
        int j = 0;
        while (j <= 100)
        {
            System.out.println(j);
            j += 10;
        }
    }
    public static void doWhileByTens()
    {
        int j = 0;
        do
        {
            System.out.println(j);
            j += 10;
        } while (j <= 100);
    }

    public static void forSequence()
    {
        for (int k = 100; k >= -100; k -= 8)
        {
            System.out.println(k);
        }
    }

    public static void whileSequence()
    {
        int k = 100;
        while (k >= -100)
        {
            System.out.println(k);
            k -= 8;
        }
    }

    public static void doWhileSequence()
    {
        int k = 100;
        do
        {
            System.out.println(k);
            k -= 8;
        } while (k >= -100);
    }

    public static void printOneToNumber(int n)
    {
        int k = 1;
        while (k <= n)
        {
            System.out.println(k);
            k += 1;
        }
    }
}
