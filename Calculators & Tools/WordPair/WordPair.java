public class WordPair
{
    private String first;
    private String second;
    
    public WordPair(String f, String s)
    {
        first = f;
        second = s;
    }
    
    public String getFirst()
    { return first; }
    
    public String getSecond()
    { return second;}
    
    public String toString()
    {
        return "(" + first + ", " + second + ")";
    }
}