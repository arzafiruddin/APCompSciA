import java.util.Scanner;

public class BMR
{
    public static void main(String [] args)
    {
        System.out.println("-------------------------------------------------");
        System.out.println("JAVA BASAL METABOLIC RATE CALCULATOR");
        System.out.println("");
        
        double weight, height, age, gender, bmr;
        
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.println("What is your gender? (Enter 1 for F and 2 for M)");
        gender = sc.nextDouble(); //Reads double value from the console
        System.out.println("");
        
        System.out.println("What is your weight in pounds(lb)?");
        weight = sc.nextDouble(); //Reads double value from the console
        System.out.println("");
        
        System.out.println("What is your height in inches(in)?");
        height = sc.nextDouble(); //Reads double value from the console
        System.out.println("");
        
        System.out.println("How old are you (in years)?");
        age = sc.nextDouble(); //Reads double value from the console
        System.out.println("");
        
        weight = weight/2.20462;
        height = height*2.54;
        
        if(gender == 2) 
        {
            bmr = 10*weight + 6.25*height - 5*age + 5;
            System.out.println("Your BMR is " + bmr + " calories");
        }
        else if(gender == 1)
        {
            bmr = 10*weight + 6.25*height - 5*age - 161;
            System.out.println("Your BMR is " + bmr + " calories");
        }
        else
        {
            System.out.println("Incorrect gender was entered");   
        }
        
        System.out.println("-------------------------------------------------");
    }
}