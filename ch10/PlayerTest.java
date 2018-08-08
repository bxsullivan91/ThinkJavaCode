public class PlayerTest
{
    public static void main(String[] args)
    {
        Player playerName = new Player("Silent T");


        System.out.println("Player Name: " + playerName.getName());
        System.out.println("Starting score: " + playerName.getScore());

        playerName.incrementScore();
        System.out.println(playerName.getScore());

        playerName.incrementScore();
        System.out.println(playerName.getScore());

        playerName.resetScore();
        System.out.println(playerName.getScore());


    }

}
