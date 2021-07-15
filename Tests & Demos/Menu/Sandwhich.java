public class Sandwhich implements MenuItem
{
    public String name;
    public double price;
    
    public Sandwhich(String nm, double p)
    {
        name = nm;
        price = p;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
}