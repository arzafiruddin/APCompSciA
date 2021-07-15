public class Drink implements MenuItem
{
    public String name;
    public double price;
    
    public Drink(String nm, double p)
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