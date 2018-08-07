public class TimeTester
{
    public static void main(String[] args)
    {
        Time currentTime = new Time(9,45);

        Time otherTime = new Time(14, 30);

        System.out.println("24-hour clock: ");
        System.out.println(currentTime.getMilitaryTime());
        System.out.println(otherTime.getMilitaryTime());
        System.out.println();

        System.out.println("12-hour clock: ");
        System.out.println(currentTime.getTime());
        System.out.println(otherTime.getTime());

        Time militaryConversion = new Time(3, 12, true);
        System.out.println(militaryConversion.getMilitaryTime());

    }
}
