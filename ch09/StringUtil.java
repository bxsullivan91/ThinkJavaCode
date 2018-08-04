public class StringUtil
{
    public static void main(String[] args)
    {

        String wordGiven = "goodbye";

        String firstLetter = getFirstCharacter(wordGiven);
        System.out.println(firstLetter);

        String lastLetter = getLastCharacter(wordGiven);
        System.out.println(lastLetter);

        String firstTwo = getFirstTwoCharacters(wordGiven);
        System.out.println(firstTwo);

        String lastTwo = getLastTwoCharacters(wordGiven);
        System.out.println(lastTwo);

        String butFirstThree = getAllButFirstThreeCharacters(wordGiven);
        System.out.println(butFirstThree);

        printCharacters(wordGiven);

        printPhoneNumber("501-555-0100");

        int first = findFirstE(wordGiven);
        System.out.println(first);

        String names = "Jake";
        boolean finnOrJake = isFinn(names);
        System.out.println(finnOrJake);


    }

    public static String getFirstCharacter(String wordGiven)
    {
        char firstLetter = wordGiven.charAt(0);
        String stFirst = Character.toString(firstLetter);
        return stFirst;
    }

    public static String getLastCharacter(String wordGiven)
    {
        char lastLetter = wordGiven.charAt(wordGiven.length() - 1);
        String stLast = Character.toString(lastLetter);
        return stLast;
    }

    public static String getFirstTwoCharacters(String wordGiven)
    {
        String firstTwo = wordGiven.substring(0, 2);
        return firstTwo;
    }

    public static String getLastTwoCharacters(String wordGiven)
    {
        String lastTwo = wordGiven.substring(wordGiven.length() - 2, wordGiven.length());
        return lastTwo;
    }

    public static String getAllButFirstThreeCharacters(String wordGiven)
    {
        //String allButFirstThree = wordGiven.substring(3);
        //return allButFirstThree;
        return wordGiven.substring(3);
    }

    public static void printCharacters(String wordGiven)
    {
        char givenChar;

        for(int i = 0; i < wordGiven.length(); i++)
        {
            givenChar = wordGiven.charAt(i);
            System.out.println(givenChar + ":" + i);
        }
    }

    public static void printPhoneNumber(String number)
    {
        String areaCode = number.substring(0, 3);
        System.out.println("Area Code: \t" + areaCode);

        String exchange = number.substring(4, 7);
        System.out.println("Exchange: \t" + exchange);

        String lineNumber = number.substring(8);
        System.out.println("Line Number: \t" + lineNumber);
    }

    public static int findFirstE(String wordGiven)
    {
        int indexOfE = wordGiven.indexOf("e");
        return indexOfE;
    }

    public static boolean isFinn(String finnJake)
    {
        boolean fOrJ = true;
        if(finnJake.equals("Finn"))
        {
            fOrJ = true;
        }
        else
        {
            fOrJ = false;
        }

        return fOrJ;
    }
}
