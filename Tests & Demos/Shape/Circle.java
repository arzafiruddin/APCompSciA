public class Circle extends Shape
{
    private double radius;
    
    public Circle(double r)
    { 
        super();
        radius = r;
    }
    
    public Circle(String nm, double r)
    {
        super(nm);
        radius = r;
    }
    
    public double getRadius()
    { return radius; }
    
    public double area()
    { return Math.PI*(Math.pow(radius, 2)); }
    
    public double perimeter()
    { return 2*(Math.PI*radius); }
    
    public String toString()
    {
        return "Name: " + this.getName() + " + Radius: " + radius;
    }
}