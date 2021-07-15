public class PirateParrot extends Parrot
{
    public PirateParrot(String name)
    {
        super(name);
        super.train("Polly wants a cracker");
    }
    
    public void stealSoul(int number)
    { 
        for(int i = 0; i <= number; i++)
        {
            super.incrementAge(); 
        }
    }
}