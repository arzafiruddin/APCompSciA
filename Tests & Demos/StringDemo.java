import java.util.Scanner;

public class StringDemo
{
    public static void main(String [] args)
    {
        
        Scanner sc = new Scanner(System.in);
        String word = new String();
        
        System.out.println("Enter a word below.");
        word = sc.nextLine();
        
        System.out.println(word + " has " + word.length() + " characters");
        
        //RETURNS THE CHARACTERS WITHIN THE SPECIFIED RANGE
        //<variable>.substring(<Beginning at this character>, <End before this character>)
        
        System.out.println("The first three letters are " + word.substring(0, 3));
        System.out.println("The last three letters are " + word.substring((word.length() - 3), word.length()));
        
        //RETURNS WHERE A SPECIFIED LETTER IS LOCATED
        //<variable>.indexOf(<String looking for>, <Being at which character>)
        
        System.out.println("Where is the first A in the word? " + word.indexOf("A", 0));
        
        //RETURNS IF BOTH STRINGS ARE THE SAME
        //<String 1>.equals(<String 2>)
        
        System.out.println("Is the word Ameen? " + word.equals("Ameen"));
        
    }
}