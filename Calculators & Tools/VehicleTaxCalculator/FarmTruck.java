public class FarmTruck extends Truck
{
    public FarmTruck()
    { super(); }
    
    public FarmTruck(int wgt, String vin)
    { super(wgt, vin); }
    
    public double getTax()
    { return super.getTax() * 0.80; }
}