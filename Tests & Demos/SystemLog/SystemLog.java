import java.util.ArrayList;
public class SystemLog
{
   /** Contains all the entries in this system log.
    *  Guaranteed not to be null and contain only non-null entries.
    */
   private ArrayList<LogMessage> messageList;
   
   public SystemLog(ArrayList<LogMessage> ml)
   {
      messageList = ml;
   }
   
   /** Removes from the system log all entries whose descriptions properly contain
    *  keyword, and returns a list (possibly empty) containing the removed entries.
    *  Postcondition:  
    *    - Entries in the returned list properly contain keyword and
    *      are in the order in which they appeard in the system log.
    *    - The remaining entries in the system log do not properly contain keyword
    *      and are in their original order.
    *    - The returned list is empty if no messages properly contain keyword.
    */
   public ArrayList<LogMessage> removeMessages(String keyword)
   { 
      ArrayList<LogMessage> resultList = new ArrayList<LogMessage>();
      
      for(int i = 0; i < messageList.size(); i++)
      {
         if(messageList.get(i).containsWord(keyword))
         {
            resultList.add(messageList.get(i));
            messageList.remove(i);
            if(messageList.get(i).containsWord(keyword))
            {
               resultList.add(messageList.get(i));
               messageList.remove(i);
            }
         }
      }
      return resultList;
   }
}