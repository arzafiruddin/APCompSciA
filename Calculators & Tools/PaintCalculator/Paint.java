public class Paint
{
    public static void main(String [] args)
    {
        // Create variables
        double height;
        double width;
        double length;
        double area;
        int numberOfCansNeeded;
        
        // Declare and initialize example
        double paintCanCoverage = 300;
        
        // Initialize the variables
        height = 8;
        width = 10;
        length = 12;
        area = 2*length*height + 2*width*height;
        numberOfCansNeeded = (int) Math.ceil(area/paintCanCoverage);
        
        System.out.println("-----------------------------------------------");
        System.out.println("JAVA PAINT");
        System.out.println("");
        System.out.println("The height of the room is " + height + " ft");
        System.out.println("The width of the room is " + width + " ft");
        System.out.println("The length of the room is " + length + " ft");
        System.out.println("");
        System.out.println("The area required to be painted is " + area + " Sq ft");
        System.out.println("");
        System.out.println("One paint can will cover " + paintCanCoverage + " Sq ft");
        System.out.println("You'll need " + numberOfCansNeeded + " can(s) of paint");
        System.out.println("-----------------------------------------------");
    }
}