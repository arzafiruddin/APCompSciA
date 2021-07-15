public class Truck extends Vehicle
{
    private int weight;
    
    public Truck()
    {
        super();
        weight = 0;
    }
    
    public Truck(int wgt, String vin)
    {
        super(vin);
        weight = wgt;
    }
    
    public int getWeight()
    { return weight; }
    
    public double getTax()
    { return 0.17 * weight; }
    
    
    
    
}