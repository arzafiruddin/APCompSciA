public abstract class Vehicle
{
    private String VIN;
    
    public Vehicle()
    { VIN = ""; }
    
    public Vehicle(String vin)
    { VIN = vin; }
    
    public String getVIN()
    { return VIN; }
    
    public abstract double getTax();
}