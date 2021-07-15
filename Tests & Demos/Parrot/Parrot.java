import java.util.ArrayList;

public class Parrot
{
    //Name of the parrot
    private String name;
    
    //Age of the parrot, initially 0.
    private int age;
    
    //List of sounds the parrot can make after being trained.
    private ArrayList<String> sounds;
    
    /** Constructs a new Parrot object */
    public Parrot(String n)
    {
        name = n;
        age = 0;
        sounds = new ArrayList<String>();
    }
    
    /** @return the age of the parrot in years. */
    public int getAge()
    { return age; }
    
    /** @return the name of the parrot */
    public String getName()
    { return name; }
    
    /** Adds sound to the list of sounds the parrot can make
     *  @param sound the sound to add
     */
    public void train(String sound)
    { sounds.add(sound); }
    
    /** @return a random sound that the parrot can make */
    public String speak()
    { return sounds.get((int)(Math.random()*sounds.size())); }
    
    /** increase the age of Parrot by 1. */
    public void incrementAge()
    { age++; }
}