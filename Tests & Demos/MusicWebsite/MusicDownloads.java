import java.util.ArrayList;
public class MusicDownloads
{
    private ArrayList<downloadInfo> downloadList;
    
    public MusicDownloads()
    {
        downloadList = new ArrayList<downloadInfo>();
        downloadList.add(new downloadInfo("Hey Jude"));
        downloadList.add(new downloadInfo("Soul Sister"));
        downloadList.add(new downloadInfo("Aqualung"));
    }
    
    public downloadInfo getDownloadInfo(String title)
    {
        downloadInfo temp = new downloadInfo(null);
        for(int i = 0; i < downloadList.size(); i++)
        {
            if(title.equals((downloadList.get(i)).getTitle()))
            {
                temp = downloadList.get(i);
            }
        }
        return temp;
    }
    
    public void updateDownloads(ArrayList<String> titles)
    {
        for(int i = 0; i < titles.size(); i++)
        {
            for(int j = 0; j < downloadList.size(); j++)
            {
                if(titles.get(i).equals((downloadList.get(j)).getTitle()))
                {
                    (downloadList.get(j)).incrementTimesDownloaded();
                }
                else
                {
                    downloadList.add(new downloadInfo(titles.get(i)));
                }
            }
        }
    }
    
    public ArrayList getDownloadList()
    {
        return downloadList;
    }
    
}