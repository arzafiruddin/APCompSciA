public class Car extends Vehicle
{
    private int age;
    
    public Car()
    {
        super();
        age = 0;
    }
    
    public Car(int a, String vin)
    {
        super(vin);
        age = a;
    }
    
    public int getAge()
    { return age; }
    
    public double getTax()
    {
        if(age < 3)
        {
            return 100.00;
        }
        else
        {
            return 50.00;
        }
    }
}