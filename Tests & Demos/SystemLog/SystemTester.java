import java.util.ArrayList;

public class SystemTester
{
    public static void main(String [] args)
    {
        LogMessage log = new LogMessage("Webserver:disk offline");
        
        System.out.println(log.getMachineId());
        System.out.println(log.getDescription());
        
        ////
        
        LogMessage log1a = new LogMessage("Webserver:disk");
        LogMessage log2a = new LogMessage("Webserver:error on disk");
        LogMessage log3a = new LogMessage("Webserver:error on /dev/disk disk");
        LogMessage log4a = new LogMessage("Webserver:error on disk DSK1");
        LogMessage sysLogError = new LogMessage("Webserver:disk offline");
        
        System.out.println(log1a.containsWord("disk"));
        System.out.println(log2a.containsWord("disk"));
        System.out.println(log3a.containsWord("disk"));
        System.out.println(log4a.containsWord("disk"));
        System.out.println(sysLogError.containsWord("disk"));
        
        LogMessage log1b = new LogMessage("Webserver:DISK");
        LogMessage log2b = new LogMessage("Webserver:error on disk3");
        LogMessage log3b = new LogMessage("Webserver:error on /dev/disk");
        LogMessage log4b = new LogMessage("Webserver:diskette");
        
        System.out.println(log1b.containsWord("disk"));
        System.out.println(log2b.containsWord("disk"));
        System.out.println(log3b.containsWord("disk"));
        System.out.println(log4b.containsWord("disk"));
        
        ////
        
        ArrayList<LogMessage> logs = new ArrayList<LogMessage>();
        
        logs.add(new LogMessage("CLIENT3:security alert - repeated login failures"));
        logs.add(new LogMessage("Webserver:disk offline"));
        logs.add(new LogMessage("SERVER1:file not found"));
        logs.add(new LogMessage("SERVER2:read error on disk DSK1"));
        logs.add(new LogMessage("SERVER1:write error on disk DSK2"));
        logs.add(new LogMessage("Webserver:error on /dev/disk"));
        
        System.out.println(logs);
        
        SystemLog sysLog = new SystemLog(logs);
        System.out.println(sysLog.removeMessages("disk"));
        
        System.out.println(logs);
    }
}