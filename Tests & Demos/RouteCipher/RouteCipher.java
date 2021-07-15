public class RouteCipher
{
   /** A two-dimensional array of single-character strings, instantiated in the constructor */
   private String [][] letterBlock;
   
   /** The number of rows of letterBlock, set by the constructor */
   private int numRows;
   
   /** The number of columns of letterBlock, set by the constructor */
   private int numCols;
   
   public RouteCipher(int r, int c)
   {
      letterBlock = new String[r][c];
   }
   
   public RouteCipher(String message, int r, int c)
   {
      letterBlock = new String[r][c];
      this.fillBlock(message);
   }
   
   
   /** Places a string into letterBlock in row-major order.
    *  @param str the string to be processed
    *  Postcondition:
    *     if str.length() < numRows * numCols, "A" is placed in each unfilled cell
    *     if str.length9) > numRows * numCols, trailing characters are ignored
    */
   private void fillBlock(String str)
   {
      int x = 0;
      for(int i = 0; i < letterBlock.length; i++)
      {
         for(int j = 0; j < letterBlock[i].length; j++)
         {
            if(x < str.length())
            {
               letterBlock[i][j] = str.substring(x, x+1);
               x++;
            }
            else
            {
               letterBlock[i][j] = "A";
            }
         }
      }
   }
   
   //Prints out letterBlock TESTING PURPOSES
   public String printArray()
   {
      String result = "";
      for(int i = 0; i < letterBlock.length; i++)
      {
         for(int j = 0; j < letterBlock[i].length; j++)
         {
            result += letterBlock[i][j] + ", ";
         }
         result += "|| ";
      }
      return result;
   }
   
   
   /** Extracts encrypted string from letterBlock in column-major order.
   *   Precondition: letterBlock has been filled
   *   @return the encrypted string from letterBlock
   */
   private String encryptBlock()
   {
      String result = "";
      for(int i = 0; i <= numCols; i++)
      {
         for(int j = 0; j < letterBlock.length; j++)
         {
            result += letterBlock[j][i];
         }
      }
      return result;
   }
   
   /** Encrypts a message.
    *  @param message the string to be encrypted
    *  @return the encrypted message:
    *          if message is the empty string, returns the empty string
    */
   public String encryptMessage(String message)
   {
      int subSize = numCols*numRows;
      String result = "";
      int x = 0;
      for(int i = 0; i < message.length()/subSize; i++)
      {
         if(x+subSize <= message.length())
         {
            fillBlock(message.substring(x, x+subSize));
            result += encryptBlock();
            x += subSize;
         }
         else
         {
            fillBlock(message.substring(x));
            result += encryptBlock();
         }
      }
      return result;
   }
}