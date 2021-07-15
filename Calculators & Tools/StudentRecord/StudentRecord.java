public class StudentRecord
{
   //contains scores.length values and scores.length > 1
   private int [] scores;
   
   //Constructs a StudentRecord object with an array of scores.
   public StudentRecord(int [] s)
   {
      scores = s;
   }
   
   /** returns the average (arithmetic mean) of the values in scores
    *  whose subscripts are between first and last, inclusive
    *  PRECONDITION: 0 <= first <= last < scores.length
    */
   public double average(int first, int last)
   {
      last = last + 1;
      int pos = first;
      double avg = 0;
      for(int i = 1; i <= last-first; i++)
      {
         avg = avg + scores[pos];
         pos++;
      }
      avg = avg/(last-first);
      return avg;
   }
    
   /** returns true if each successive value in scores is greater than
    *  or equal to the previous value; false otherwise.
    */
   public boolean hasImproved()
   {
      boolean imprv = false;
      for(int i = 0; i < scores.length-1; i++)
      {
         if(scores[i] < scores[i+1])
         {
            imprv = true;
         }
         else
         {
            imprv = false;
         }
      }
      return imprv;
   }  
   
   /** if the values in scores have imrpoved, returns the average of
    *  the elements in scores with indexes greater than or equal to 
    *  scores.length/2; otherwise, returns the average of all the 
    *  values in scores
    */
   public double finalAverage()
   {
      if(this.hasImproved())
      {
         int firstSub = (int)Math.ceil(scores.length/2);
         return this.average(firstSub, scores.length-1);
      }
      else
      {
         return this.average(0, scores.length-1);
      }
   } 
}