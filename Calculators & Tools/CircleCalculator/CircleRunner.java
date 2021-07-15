public class CircleRunner
{
    public static void main(String [] args)
    {
        System.out.println("JAVA CIRCLE METHOD PROGRAM");
        System.out.println();
        
        // Creates circle c1 with radius of 3 and center of (3, 3)
        Circle c1 = new Circle(3, 3, 3);
        
        // Creates circle c2 with radius of 3 and center of (0, 0)
        Circle c2 = new Circle(3);
        
        // Creates circle c3 with radius of 0 and center of (0, 0)
        Circle c3 = new Circle();
        
        // Creates circle c4 with radius of 3 and center of (3, 3)
        Circle c4 = new Circle(3, 3, 3);
        
        // Prints c1's radius and center
        System.out.println("Circle 1 > Radius: " + c1.getRadius() + " | Center: 
        (" + c1.getCenterX() + ", " + c1.getCenterY() + ")");
        
        // Prints c2's radius and center
        System.out.println("Circle 2 > Radius: " + c2.getRadius() + " | Center: 
        (" + c2.getCenterX() + ", " + c2.getCenterY() + ")");
        
        // Prints c3's radius and center
        System.out.println("Circle 3 > Radius: " + c3.getRadius() + " | Center: 
        (" + c3.getCenterX() + ", " + c3.getCenterY() + ")");
        
        System.out.println();
        
        // Does the same thing as above, but uses toString() override method
        System.out.println("Circle 1 > " + c1);
        System.out.println("Circle 2 > " + c2);
        System.out.println("Circle 3 > " + c3);
        System.out.println("Circle 4 > " + c4);
        
        System.out.println();
        
        // Prints c1's area, diameter and circumference
        System.out.println("Circle 1 > Area: " + c1.getArea() + " | Diameter: " 
        + c1.getDiameter() + " | Circumference: " + c1.getCircumference());
        
        // Prints c2's area, diameter and circumference
        System.out.println("Circle 2 > Area: " + c2.getArea() + " | Diameter: " 
        + c2.getDiameter() + " | Circumference: " + c2.getCircumference());
        
        // Prints c3's area, diameter and circumference
        System.out.println("Circle 3 > Area: " + c3.getArea() + " | Diameter: " 
        + c3.getDiameter() + " | Circumference: " + c3.getCircumference());
        
        // Prints c4's area, diameter and circumference
        System.out.println("Circle 4 > Area: " + c4.getArea() + " | Diameter: " 
        + c4.getDiameter() + " | Circumference: " + c4.getCircumference());
        
        System.out.println();
        
        // Checks for equality using .equals() override method
        System.out.println("Circle 1 == Circle 4? > " + c1.equals(c4));
        System.out.println("Circle 1 == Circle 2? > " + c1.equals(c2));
        
        System.out.println();
        
    }
}