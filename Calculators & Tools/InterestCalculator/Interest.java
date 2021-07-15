import java.util.Scanner;

public class Interest
{
    public static void main(String [] args)
    {
        System.out.println("----------------------------------------------");
        System.out.println("JAVA COMPOUND INTEREST CALCULATOR");
        System.out.println("");
        
        //Declare and initialize variables
        double p, r, a;
        int t;
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.println("How much money are you going to invest?");
        p = sc.nextDouble(); //Reads double value from the console
        System.out.println("");
        
        System.out.println("How long are you going to invest your money (in years)?");
        t = sc.nextInt(); //Reads double value from the console
        System.out.println("");
        
        System.out.println("What is your interest rate (as a percent)?");
        r = sc.nextDouble(); //Reads double value from the console
        System.out.println("");
        
        a = p*Math.pow(Math.E, (r/100)*t);
        
        System.out.println("After " + t + " years, you will have $" + a);
        
        double moneyMade = a - p;
        
        if(moneyMade < 500)
        {
            System.out.println("You made a little bit of money");
        }
        else if(500 <= moneyMade && moneyMade < 1000)
        {
            System.out.println("You made a good amount of money");
        }
        else
        {
            System.out.println("Wow! You are rolling in dough.");
        }
        
        System.out.println("----------------------------------------------");
    }
}