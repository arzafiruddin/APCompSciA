public abstract class Shape
{
    private String name;
    
    public Shape()
    { name = "___"; }
    
    public Shape(String nm)
    { name = nm; }
    
    public String getName()
    { return name; }
    
    public abstract double area();
    
    public abstract double perimeter();
    
    public double semiperimeter()
    { return this.perimeter()/2; }
    
    public abstract String toString();
}