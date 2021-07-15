public abstract class Pet
{
    private String name;
    private int weight;
    private int height;
    
    public Pet()
    {
        name = "No Name";
        weight = 0;
        height = 0;
    }
    
    public Pet(String nm, int wgt, int hgt)
    {
        name = nm;
        weight = wgt;
        height = hgt;
    }
    
    public String getName()
    { return name; }
    
    public int getWeight()
    { return weight; }
    
    public int getHeight()
    { return height; }
    
    public void setName(String nm)
    { name = nm; }
    
    public void setWeight(int wgt)
    { weight = wgt; }
    
    public void setHeight(int hgt)
    { height = hgt; }
    
    public abstract void speak();
    
    
}