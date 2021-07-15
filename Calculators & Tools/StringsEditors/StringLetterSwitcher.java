import java.util.Scanner;

public class StringLetterSwitcher
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String sentence = "";
        String s1 = "";
        String s2 = "";
        
        System.out.println("Input sentence:");
        sentence = sc.nextLine();
        
        double sentLength = sentence.length();
        
        System.out.println("Input letter 1:");
        s1 = sc.nextLine();
        
        System.out.println("Input letter 2:");
        s2 = sc.nextLine();
        
        for(int i = 0; i < sentLength; i++)
        {
            
            String scLetter = sentence.substring(i, i + 1);
            
            //System.out.println(scLetter); USED FOR DEBUGGING PROCESS
            
            if(scLetter.equals(s1))
            {
                sentence = sentence.substring(0, i) + s2 + sentence.substring(i + 1);
            }
            else if(scLetter.equals(s2))
            {
                sentence = sentence.substring(0, i) + s1 + sentence.substring(i + 1);
            }
            
            //System.out.println(sentence); USED FOR DEBUGGING PROCESS
        }
        
        System.out.println("New sentence: " + sentence);
    }
}