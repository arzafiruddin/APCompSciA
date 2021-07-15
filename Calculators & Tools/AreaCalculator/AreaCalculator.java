import java.util.Scanner;

public class AreaCalculator
{
    public static void main(String [] args)
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println("JAVA AREA CALCULATOR");
        System.out.println("");
        
        Scanner sc = new Scanner(System.in);
        String response = "";
        
        while(response.equalsIfIgnoreCase("Q")
        {
            
        }
        
        System.out.println("What shape would you like to find the area of?");
        System.out.println("Possible Choices: Rectangle, Circle, Triangle, Trapezoid");
        System.out.println("(Enter Q to exit the program)");
        response = sc.nextLine();
        
        if(response.equals("Rectangle"))
        {
            System.out.println("");
            System.out.println("What is the length of the rectangle?");
            double length = sc.nextDouble();
            System.out.println("What is the width of the rectangle?");
            double width = sc.nextDouble();
            double area = getAreaRectangle(length, width);
            System.out.println("");
            System.out.println("The area of the rectangle is " + area);
        }
        else if(response.equals("Circle"))
        {
            System.out.println("");
            System.out.println("What is the radius of the circle?");
            double radius = sc.nextDouble();
            double area = getAreaCircle(radius);
            System.out.println("");
            System.out.println("The area of the circle is " + area);
        }
        else if(response.equals("Triangle"))
        {
            System.out.println("");
            System.out.println("What is the base of the triangle?");
            double base = sc.nextDouble();
            System.out.println("What is the height of the triangle?");
            double height = sc.nextDouble();
            double area = getAreaTriangle(base, height);
            System.out.println("");
            System.out.println("The area of the triangle is " + area);
        }
        else if(response.equals("Trapezoid"))
        {
            System.out.println("");
            System.out.println("What is the upper base of the trapezoid?");
            double baseA = sc.nextDouble();
            System.out.println("What is the lower base of the trapezoid?");
            double baseB = sc.nextDouble();
            System.out.println("What is the height of the trapezoid?");
            double height = sc.nextDouble();
            double area = getAreaTrapezoid(baseA, baseB, height);
            System.out.println("");
            System.out.println("The area of the trapezoid is " + area);
        }
        else
        {
            System.out.println("");
            System.out.println("ERROR: Shape not listed");
        }
        if(sc.hasNext()) //Clears the scanner so it can begin to read text again after numbers
        {
            sc.nextLine();
        }
        
        System.out.println("-------------------------------------------------------------");
    }
    
    public static double getAreaRectangle(double length, double width)
    {
        return length*width;
    }
    
    public static double getAreaCircle(double radius)
    {
        return Math.PI*radius*radius;
    }
    
    public static double getAreaTriangle(double base, double height)
    {
        return (base*height)/2;
    }
    
    public static double getAreaTrapezoid(double baseA, double baseB, double height)
    {
        return ((baseA + baseB)/2)*height;
    }
}