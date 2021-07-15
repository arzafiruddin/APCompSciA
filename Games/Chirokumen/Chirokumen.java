/**
 * CHIROKUMEN: A POKEMON STORY
 * Class for a mediocre text-based fighting based named
 * after Mr. Wood's proposed Pokemon name.
 * @author Ameen Rasheed Zafiruddin
 */

public class Chirokumen
{
    /**
     * Sets class variables:
     * String name > name of Chirokumen
     * int health > health of Chirokumen
     */
    private String name;
    private int health;
    
    /**
     * Creates a new Chirokumen with a given name
     * and 100 health
     * @param nm > the name of the Chirokumen
     */
    public Chirokumen(String nm)
    {
        name = nm;
        health = 100;
    }
    
    /**
     * Gets the current health for the Chirokumen
     * @return > health amount of the Chirokumen
     */
    public int getHealth()
    {
        return health;
    }
    
    /**
     * Gets the current name of the Chirokumen
     * @return > name of Chirokumen
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Sets the name of the Chirokumen to the provided value
     * @param nm > value to set Chirokumen's name
     */
    public void setName(String nm)
    {
        name = nm;
    }
    
    /**
     * Checks to see if the Chirokumen has 0 health or not
     * @return true > if Chirokumen's health is 0
     * @return false > if Chirokumen's health is above 0
     * Precondition: health is a value 0 <= health <= 100
     * Postcondition: the value of the health remains unchanged
     */
    public boolean isDead()
    {
        if(health == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Increases the Chirokumen's health by a random value
     * between 0 and 25
     * Precondition: health > 0
     * Postcondition: the value of the health is increased
     */
    public void heal()
    {
        if(isDead() == true)
        {
            health = health;
        }
        else
        {
            int rng = (int)(Math.random()*25);
            health = health + rng;
            
            if(health > 100)
            {
                health = 100;
            }
            else
            {
                health = health;
            }
        }
    }
    
    /**
     * Decreases the Chirokumen's health by a random value
     * between 0 and 25
     * Precondition: health > 0
     * Postcondition: the value of the health is decreasedu
     */
    public void takeDamage()
    {
        if(isDead() == true)
        {
            health = health;
        }
        else
        {
            int rng = (int)(Math.random()*25);
            health = health - rng;
            
            if(health < 0)
            {
                health = 0;
            }
            else
            {
                health = health;
            }
        }
    }
}