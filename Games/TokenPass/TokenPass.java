public class TokenPass
{
   private int [] board;
   private int currentPlayer;
   
   /** Creates the board array to be of size playercount and fills it with
    *  random integer values from 1 to 10 inclusive. Initializes currentPlayer to a
    *  random integer value in the range between 0 and playerCount - 1, inclusive.
    *  @param playerCount the number of players
    */
   public TokenPass(int playercount)
   {
     board = new int[playercount];
     for(int i = 0; i < playercount; i++)
     {
        board[i] = (int)(Math.random()*11);
     }
     currentPlayer = (int)(Math.random()*playercount);
   }
   
   /** Distributes the tokens from the current player's position one at a time to each player in
    *  the game. Distribution begins with the next position and continues until all the tokens have
    *  been distributed. If there are still tokens to distribute when the player at the
    *  highest position is reached, the next token will be distributed to the player at position 0.
    *  PRECONDITION: the current player has at least one token
    *  POSTCONDITION: the current player has not changed.
    */
   public void distributeCurrentPlayerTokens()
   {
     int player = currentPlayer + 1;
     
     while(board[currentPlayer] != 0)
     {
        if(player == board.length)
        {
           player = 0;
        }
        board[player] = board[player]+1;
        board[currentPlayer] = board[currentPlayer]-1;
        player++;
     }
     
     currentPlayer++;
     if(currentPlayer == board.length)
        {
           currentPlayer = 0;
        }
   }

   /** Returns a String representation of the current TokenPass object in the following format
    *  Board: [ <value1> , <value2> , <value3> , ... <last value> ] Current Player: <current player>
    *  @returns the TokenPass object as a String.
    */ 
   @Override
   public String toString()
   {
      String result = "Board: [" + board[0];
      for(int i = 1; i < board.length; i++)
      {
         result = result + ", " + board[i];
      }
      result = result + "] Current Player: " + currentPlayer;
      return result;
   }
   
   /**
    * Get methods for testing
    */
    
   public int getCurrentP()
   {
      return currentPlayer;
   }
   
   public int getPlayer1()
   {
      return board[0];
   }
   
   public int getPlayer2()
   {
      return board[1];
   }
   
   public int getPlayer3()
   {
      return board[2];
   }
   
   public int getPlayer4()
   {
      return board[3];
   }
}