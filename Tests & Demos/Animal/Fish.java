public class Fish extends Pet
{
    public Fish()
    { super(); }
    
    public Fish(String nm, int wgt, int hgt)
    { super(nm, wgt, hgt); }
    
    public void speak()
    { System.out.println("Blub-Blub..."); }
}