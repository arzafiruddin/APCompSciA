public class Salad implements MenuItem
{
    public String name;
    public double price;
    
    public Salad(String nm, double p)
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