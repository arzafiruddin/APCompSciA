public class PointRunner
{
    public static void main(String [] args)
    {
        Point p1 = new Point(2, 3); //Creates point (2,3)
        Point origin = new Point(); //Creates point (0,0)
        Point p2 = new Point(5, 2);
        
        System.out.println("p1's x value is " + p1.getXCoordinate());
        System.out.println("p1's y value is " + p1.getYCoordinate());
        System.out.println("origin's x value is " + origin.getXCoordinate());
        System.out.println("origin's y value is " + origin.getYCoordinate());
        System.out.println("distance between p1 and origin is " + p1.getDistanceFromTheOrigin());
        System.out.println("p1 in point slope form is " + p1.getEquationWithSlope(3));
        System.out.println();
        System.out.println(p1.getSlope(p2));
        System.out.println("p1 and p2 in point slope form is " + p1.getEquationBetween2Points(p2));
        
        
    }
}