import java.util.ArrayList;
public class WordPairList
{
    private ArrayList<WordPair> allPairs;
    
    public WordPairList(String [] words)
    {
        allPairs = new ArrayList<WordPair>();
        
        for(int i = 0; i < words.length-1; i++)
        {
            for(int j = i+1; j < words.length; j++)
            {
                allPairs.add(new WordPair(words[i], words[j]));
            }
        }
    }
    
    public int numMatches()
    {
        int count = 0;
        for(int i = 0; i < allPairs.size(); i++)
        {
            if(((allPairs.get(i)).getFirst()).equals((allPairs.get(i)).getSecond()))
            {
                count++;
            }
        }
        return count;
    }
    
    public String toString()
    {
        String result = (allPairs.get(0)).toString();
        for(int i = 1; i < allPairs.size(); i++)
        {
            result = result + ", " + (allPairs.get(i)).toString();
        }
        return result;
    }
}