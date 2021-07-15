import java.util.Scanner;

public class StringTypo
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String string = new String();
        
        System.out.println("Enter your string:");
        string = sc.nextLine();
        
        double randValue1 = Math.random()*string.length();
        int randValue2 = (int)randValue1;
        
        string = string.substring(0, randValue2) + string.substring(randValue2 + 1);
        
        System.out.println("New String: ");
        System.out.println(string);
        
    }
}