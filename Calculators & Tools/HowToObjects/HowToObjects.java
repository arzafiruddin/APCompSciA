import java.util.Random;
import java.util.Scanner;

public class HowToObjects
{
    public static void main(String [] args)
    {
        //How to create an object
        //<type> <name> = new <type>(<parameters>)
        Random rng = new Random();
        Scanner sc = new Scanner(System.in);
        
        int scanner = 0;
        int randomNumber = 0;
        
        System.out.println("How many digits do you want to have in your number?");
        scanner = sc.nextInt();
        
        System.out.print("Random number is ");
        //Create a for loop
        //for(<create count variable>; <stop condition>; <count by>)
        for(int i = 0; i < scanner; i++) // i++ == i+=1 == i=i+1
        {
            //Calling method on rng to get a random number
            //How to call a method
            //<object_name>.<method_name>(<parameters>)
            randomNumber = rng.nextInt(10);
            System.out.print(randomNumber);
        }
        System.out.println("");
        
        
    }
}