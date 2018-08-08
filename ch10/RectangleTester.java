public class RectangleTester
{
    public static void main(String[] args)
    {
        Rectangle first = new Rectangle();
        System.out.println(first.getArea());

        Rectangle second = new Rectangle(12, 34);
        System.out.println(second.dimensions());

        Rectangle third = new Rectangle(second);

        System.out.println(third.getHeight());
    }
}
