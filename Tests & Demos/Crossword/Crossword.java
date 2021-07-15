public class Crossword
{
   /** Each element is a Square object with a color (black or white) and a number.\
    *  puzzle[r][c] represents the square in row r, column c.
    *  There is at least one row in the puzzle.
    */
   private Square [][] puzzle;
   
   /** Constructs a crossword puzzle grid.
    *  Precondition: There is at least one row in blackSquares.
    *  Postcondition: 
    *     - The crossword puzzle grid has the same dimensions as blackSquares
    *     - The Square object at row r, column c in the crossword puzzle is black
    *       if and only if blackSquares[r][c] is true.
    *     - The squares in the puzzle are labeled according to the crossword labeling rule.
    */
   public Crossword(boolean [][] blackSquares)
   { 
      puzzle = new Square[blackSquares.length][blackSquares[0].length];
      int num = 1;
      for(int r = 0; r < puzzle.length; r++)
      {
         for(int c = 0; c < puzzle[0].length; c++)
         {
            if(toBeLabeled(r, c, blackSquares))
            {
               puzzle[r][c] = new Square(false, num);
               num++;
            }
            else
               puzzle[r][c] = new Square(blackSquares[r][c], 0);
         }
      }
   }
   
   /** Returns true if the square at row r, column c should be labeled with a positive
    *  number; false otherwise.
    *  The Square object at row r, column c in the crossword puzzle is black
    *  if and only if blackSquares[r][c] is true.
    *  Precondition: r and c are valid indexes in blackSquares.
    */
   private boolean toBeLabeled(int r, int c, boolean [][] blackSquares)
   {
      if(blackSquares[r][c])
       return false;
      if(r == 0 || blackSquares[r - 1][c])
       return true;
      if(c == 0 || blackSquares[r][c - 1])
       return true;
      return false;
   }
   
   /** returns a String representation of this crossword puzzle. */
   public String toString()
   {
      String result = "";
      for(int i = 0; i<puzzle.length; i++)
      {
         for(int j = 0; j<puzzle[0].length; j++)
         {
            if(puzzle[i][j].getIsBlack())
               result = result + "B  ";
            else if(puzzle[i][j].getNum() == 0)
            {
               result = result + "   ";
            }
            else if(puzzle[i][j].getNum() < 10)
               result = result + puzzle[i][j].getNum() + "  ";
            else
               result = result + puzzle[i][j].getNum() + " ";
         }
         result = result + "\n";
      }
      
      return result;
   } 
   
   
}