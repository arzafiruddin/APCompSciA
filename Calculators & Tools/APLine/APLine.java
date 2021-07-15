public class APLine
{
    private double a;
    private double b;
    private double c;
    
    public APLine(double aa, double bb, double cc)
    {
        a = aa;
        b = bb;
        c = cc;
    }
    
    public String getEquation()
    {
        return a + "x + " + b + "y + " + c + " = 0";
    }
    
    public double getSlope()
    {
        double slopeCalc = (-a)/b;
        return slopeCalc;
    }
    
    public String printSlope()
    {
        double slopeCalc = (-a)/b;
        return (-a) + "/" + b + " = " + slopeCalc;
    }
    
    public boolean isOnLine(double x, double y)
    {
        if((a * x) + (b * y) + c == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}