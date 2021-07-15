public class downloadInfo
{
    private String songTitle;
    private int numberOfDownloads;
    
    public downloadInfo(String title)
    {
        songTitle = title;
        numberOfDownloads = 1;
    }
    
    public String getTitle()
    {
        return songTitle;
    }
    
    public void incrementTimesDownloaded()
    {
        numberOfDownloads++;
    }
    
    public int getTimesDownloaded()
    {
        return numberOfDownloads;
    }
    
    public String toString()
    {
        return songTitle + " downloaded " + numberOfDownloads + " times";
    }
    
}