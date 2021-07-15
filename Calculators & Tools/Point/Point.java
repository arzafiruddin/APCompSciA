public class Point
{
    //CLASS VARIABLES
    private double xCoord; //x-coordinate of the point
    private double yCoord; //y-coordinate of the point
    
    //CONSTUCTOR - to create a point
    public Point(double x, double y)
    {
        //Initialize class variables
        xCoord = x;
        yCoord = y;
    }
    
    //DEFAULT CONSTRUCTOR - sets point to the origin
    public Point()
    {
        xCoord = 0;
        yCoord = 0;
    }
    
    //GET METHODS - reports specified variable
    public double getXCoordinate()
    {
        return xCoord;
    }
    
    public double getYCoordinate()
    {
        return yCoord;
    }
    
    public double getDistanceFromTheOrigin()
    {
        return Math.sqrt((xCoord*xCoord)+(yCoord*yCoord));
    }
    
    public String getEquationWithSlope(double m)
    {
        String result = "";
        result = "y - " + yCoord + " = " + m + "(x - " + xCoord + ")";
        return result;
    }
    
    public double getSlope(Point p)
    {
        double changeInY = yCoord - p.getYCoordinate();
        double changeInX = xCoord - p.getXCoordinate();
        return changeInY/changeInX;
    }
    
    public String getEquationBetween2Points(Point p)
    {
        double slope = this.getSlope(p);
        String equation = this.getEquationWithSlope(slope);
        return equation;
    }
    
    //OVERRIDE - the toString() method
    public String toString()
    {
        return "(" + xCoord + ", " + yCoord + ")";
    }
    
    //OVERRIDE - the equals() method
    
}