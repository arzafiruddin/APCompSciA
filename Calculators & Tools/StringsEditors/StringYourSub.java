import java.util.Scanner;

public class StringYourSub
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String word = new String();
        int b1 = 0;
        int b2 = 0;
        
        System.out.println("Enter your string:");
        word = sc.nextLine();
        
        System.out.println("Your string has length " + word.length() + ". Enter the numbers you want to look between.");
        b1 = sc.nextInt();
        b2 = sc.nextInt();
        
        System.out.println("The part of the string between " + b1 + " and " + b2 + " is: " + word.substring(b1 - 1, b2 + 1));
    }
}