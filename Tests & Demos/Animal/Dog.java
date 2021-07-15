public class Dog extends Pet
{
    private String breed;
    
    public Dog()
    {
        super();
        breed = "Unknown";
    }
    
    public Dog(String nm, int wgt, int hgt, String brd)
    {
        super(nm, wgt, hgt);
        breed = brd;
    }
    
    public void speak()
    {
        System.out.println("Woof, Woof!");
    }
    
    public void setBreed(String brd)
    {
        breed = brd;
    }
    
    public String getBreed()
    {
        return breed;
    }
    
}