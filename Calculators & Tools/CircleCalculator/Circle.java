public class Circle
{
    private double radius;
    private double centerX;
    private double centerY;
    
    public Circle(double r, double cX, double cY)
    {
        radius = r;
        centerX = cX;
        centerY = cY;
    }
    
    public Circle(double r)
    {
        radius = r;
        centerX = 0;
        centerY = 0;
    }
    
    public Circle()
    {
        radius = 0;
        centerX = 0;
        centerY = 0;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public double getCenterX()
    {
        return centerX;
    }
    
    public double getCenterY()
    {
        return centerY;
    }
    
    public double getArea()
    {
        return Math.PI*(Math.pow(radius, 2));
    }
    
    public double getCircumference()
    {
        return 2*(Math.PI*radius);
    }
    
    public double getDiameter()
    {
        return radius*2;
    }
    
    @Override
    public String toString()
    {
        return "Radius: " + radius + " | Center: (" + centerX + ", " + centerY + ")";
    }
    
    @Override
     public boolean equals(Object x)
    {
        Circle c = (Circle) x;
        
        if(radius == c.getRadius())
        {
            if(centerX == c.getCenterX())
            {
                if(centerY == c.getCenterY())
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    
}