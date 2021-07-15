import java.util.ArrayList;

public class TaxCollection
{
    public static void main(String [] args)
    {
        ArrayList<Vehicle> roster = new ArrayList<Vehicle>();
        
        roster.add(new Car(2, "C01"));
        roster.add(new Car(5, "C02"));
        roster.add(new FarmTruck(2000, "F01"));
        roster.add(new Truck(2000, "T01"));
        
        double tax = 0.00;
        
        for(Vehicle i: roster)
        {
            tax += i.getTax();
            System.out.println("VIN: " + i.getVIN() + " | Tax: " + i.getTax());
        }
        
        System.out.println("Total Tax Collected: " + tax);
    }
}