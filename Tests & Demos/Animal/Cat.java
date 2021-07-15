public class Cat extends Pet
{
    public Cat()
    { super(); }
    
    public Cat(String nm, int wgt, int hgt)
    { super(nm, wgt, hgt); }
    
    public void speak()
    { System.out.println("Meow, Meow!"); }
}