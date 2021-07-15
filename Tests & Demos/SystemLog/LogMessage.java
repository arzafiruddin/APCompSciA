public class LogMessage
{
   private String machineId;
   private String description;
   
   /** Precondition: message is a valid log message. */
   public LogMessage(String message)
   {
      machineId = message.substring(0,message.indexOf(":",0));
      description = message.substring(message.indexOf(":",0)+1);
   }
   
   /**  Returns true if the description in this log message properly contains keyword;
    *           false otherwise.
    */
   public boolean containsWord(String keyword)
   {
      if(description.substring(0, 4).equals(keyword) && description.indexOf(keyword + " ",0) >= 0)
      {
         return true;
      }
      else if(description.substring(description.length()-4,description.length()).equals(keyword) && description.indexOf(" " + keyword,0) >= 0)
      {
         return true;
      }
      else if(description.indexOf(" " + keyword + " ", 0) >= 0)
      {
         return true;
      }
      else if(description.equals(keyword))
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public String getMachineId()
   { return machineId; }
   
   public String getDescription()
   { return description; }
   
   public String toString()
   {
      return machineId + ":" + description;
   }
}