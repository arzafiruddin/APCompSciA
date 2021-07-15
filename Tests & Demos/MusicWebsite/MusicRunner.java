import java.util.ArrayList;
public class MusicRunner
{
    public static void main(String [] args)
    {
        MusicDownloads soundtrack = new MusicDownloads();
        
        String [] list = {"Lights", "Aqualung", "Soul Sister", "Go Now", "Lights", "Soul Sister"};
        ArrayList<String> dvd = new ArrayList<String>();
        for(int i = 0; i < list.length; i++)
        {
            dvd.add(list[i]);
        }
        
        System.out.println(soundtrack.getDownloadInfo("Hey Jude"));
        System.out.println(soundtrack.getDownloadInfo("Aqualung"));
        System.out.println(soundtrack.getDownloadInfo("Happy Birthday"));
        
        soundtrack.updateDownloads(dvd);
        
        System.out.println(soundtrack.getDownloadList());
        
    }
}