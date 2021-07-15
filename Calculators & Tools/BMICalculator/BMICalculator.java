import java.util.Scanner;

public class BMICalculator
{
    public static void main(String [] args)
    {
        System.out.println("------------------------------------------------------");
        System.out.println("JAVA BMI CALCULATOR");
        System.out.println("");
        
        //--------------------------------------------------------
        
        //VARIABLES
        double unit, weight, height, bmi, heightCalc;
        String name;
        
        bmi = 0;
        
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.println("What is your name?");
        name = sc.nextLine();
        System.out.println("");
        
        System.out.println("What units would you like to use? (Type either number)");
        System.out.println("Standard(lb/in): 1");
        System.out.println("Metric(kg/m): 2");
        unit = sc.nextDouble();
        System.out.println("");
        
        System.out.println("What is your weight (in selected unit)?");
        weight = sc.nextDouble();
        System.out.println("");
        
        System.out.println("What is your height (in selected unit)?");
        height = sc.nextDouble();
        System.out.println("");

        //--------------------------------------------------------
        
        //CALCULATION
        if(unit == 1)
        {
            heightCalc = height*height;
            bmi = weight/heightCalc;
            bmi = bmi*703;
        }
        else if(unit == 2)
        {
            height = height*height;
            bmi = weight/height;
        }
        else
        {
            System.out.println("Error: Incorrect unit selected");
        }
        
        //--------------------------------------------------------
        
        //BMI SUMMARY
        if(unit == 1)
        {
            System.out.println("BMI Summary Report");
            System.out.println();
            System.out.println("Name: " + name);
            System.out.println("Weight: " + weight + " lbs.");
            System.out.println("Height: " + height + "in.");
            System.out.println("BMI: " + bmi);
            System.out.println();
        }
        else if(unit == 2)
        {
            System.out.println("BMI Summary Report");
            System.out.println();
            System.out.println("Name: " + name);
            System.out.println("Weight: " + weight + " kg.");
            System.out.println("Height: " + height + "m.");
            System.out.println("BMI: " + bmi);
            System.out.println();
        }
        else
        {
            System.out.println("Error: Incorrect unit selected");
        }
        
        //--------------------------------------------------------
        
        //BMI STATEMENT
        if(bmi <= 18)
        {
            System.out.println(name + ", based on your BMI, you are underweight.");
        }
        else if(bmi > 18 && bmi <= 18.5)
        {
            System.out.println(name + ", based on your BMI, you are thin for your height.");
        }
        else if(bmi > 18.5 && bmi <+ 25)
        {
            System.out.println(name + ", based on your BMI, you are at a healthy weight.");
        }
        else if(bmi > 25 && bmi <= 30)
        {
            System.out.println(name + ", based on your BMI, you are overweight.");
        }
        else if(bmi > 30)
        {
            System.out.println(name + ", based on your BMI, you are obese.");
        }
        else
        {
            System.out.println("Error: BMI not calculated properly");
        }

        //--------------------------------------------------------
        
        System.out.println("------------------------------------------------------");
    }
}