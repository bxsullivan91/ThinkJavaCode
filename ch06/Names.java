public class Names
{
    public static void main(String[] args)
    {
        String myName = getMyName();
        System.out.println(myName);

        String fancyName = getMyFancyName("$$$");
        System.out.println(fancyName);
    }

    public static String getMyName()
    {
        return "Silent T";
    }

    public static String getMyFancyName(String decoration)
    {
        return decoration + "Silent T" + decoration;
    }
}
