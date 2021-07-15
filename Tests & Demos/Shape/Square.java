public class Square extends Shape
{
    private double sideLength;
    
    public Square(double sl)
    { 
        super();
        sideLength = sl;
    }
    
    public Square(String nm, double sl)
    {
        super(nm);
        sideLength = sl;
    }
    
    public double getSideLength()
    { return sideLength; }
    
    public double area()
    { return sideLength*sideLength; }
    
    public double perimeter()
    { return sideLength*4; }
    
    public String toString()
    {
        return "Name: " + this.getName() + " + Side Length: " + sideLength;
    }
}