public class Book
{
    private String author;
    private String title;
    
    public Book(String t, String a)
    {
        title = t;
        author = a;
    }
    
    public Book(String t)
    {
        title = t;
        author = "None";
    }
    
    public Book()
    {
        title = "None";
        author = "None";
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String t)
    {
        title = t;
    }
    
    public void setAuthor(String a)
    {
        author = a;
    }
    
    public String toString()
    {
        return title + " by " + author;
    }
    
    public boolean equals(Object x)
    {
        Book b = (Book) x;
        if(author.equals(b.getAuthor()))
        {
            if(title.equals(b.getTitle()))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}