import java.util.Scanner;

public class Square
{
    public static void main(String [] args)
    {
        System.out.println("----------------------------------------------");
        System.out.println("JAVA QUADRATIC ROOT FINDER");
        System.out.println("");
        
        //Declare and initialize variables
        double a, b, c;
        double root1, root2;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.println("What is the value of 'a' in the equation?");
        a = sc.nextDouble(); //Reads double value from the console
        System.out.println("");
        
        System.out.println("What is the value of 'b' in the equation?");
        b = sc.nextDouble();
        System.out.println("");
        
        System.out.println("What is the value of 'c' in the equation?");
        c = sc.nextDouble();
        System.out.println("");
        
        //Step by step function
        double discriminant = b*b - 4*a*c;
        root1 = Math.sqrt(discriminant);
        root1 = -b + root1;
        root1 = root1/(2*a);
        
        //Single function
        root2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        
        
        System.out.print("Quadratic Equation: ");
        System.out.println(a + "x^2 + " + b + "x + " + c);
        System.out.println("");
        //2 real roots
        if(discriminant > 0) 
        {
            System.out.println("2 Real Roots:");
            System.out.println("The roots are " + root1 + " and " + root2);
        }
        //1 real root
        else if(discriminant == 0)
        {
            System.out.println("1 Real Root:");
            System.out.println("The root is " + root1);
        }
        //0 real roots
        else
        {
            System.out.println("0 Real Roots:");
            System.out.println("There are no real roots");
        }
        
        System.out.println("----------------------------------------------");
    }
}