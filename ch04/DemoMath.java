public class DemoMath
{
    public static void main(String[] args)
    {
        int a = -5;
        int b = 7;
        double ab = 1.2;

        System.out.println("A): " + a);
        System.out.println("A demo: " + Math.abs(a));

        System.out.println("B): " + b);
        System.out.println("B demo: " + Math.max(a, b));

        System.out.println("C): " + ab);
        System.out.println("C demo: " + Math.pow(ab, ab));

        System.out.println("D): " + Math.PI);

    }
}
