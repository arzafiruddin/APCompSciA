public class TokenPassRunner
{
    public static void main(String [] args)
    {
        TokenPass game = new TokenPass(4);
        
        System.out.println("TURN 1");
        System.out.println(game.getCurrentP());
        System.out.println();
        System.out.println(game.getPlayer1());
        System.out.println(game.getPlayer2());
        System.out.println(game.getPlayer3());
        System.out.println(game.getPlayer4());
        game.distributeCurrentPlayerTokens();
        System.out.println();
        System.out.println("TURN 2");
        System.out.println(game.getCurrentP());
        System.out.println();
        System.out.println(game.getPlayer1());
        System.out.println(game.getPlayer2());
        System.out.println(game.getPlayer3());
        System.out.println(game.getPlayer4());
        System.out.println();
        System.out.println(game.toString());
    }
}