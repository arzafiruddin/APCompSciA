public class StringWithLoop
{
    public static void main(String [] args)
    {
        String s1 = "computer";
        String s2 = "science";
        
        //Example of using a for loop to process each character of a string
        
        /*
        int count1 = 0;
        int count2 = 0;
        String letter = "a";
        int counter1 = 0;
        int counter2 = 1;
        
        for(int i = 0; i < s1.length(); i++)
        {
            letter = s1.substring(counter1, counter2);
            if(letter.equals("c"))
            {
                count1 = count1 + 1;
            }
            else
            {
                count1 = count1;
            }
            counter1 = counter1 + 1;
            counter2 = counter2 + 1;
        }
        System.out.println("Number of Cs in " + s1 + ": " + count1);
        
        counter1 = 0;
        counter2 = 1;
        
        for(int i = 0; i < s2.length(); i++)
        {
            letter = s2.substring(counter1, counter2);
            if(letter.equals("c"))
            {
                count2 = count2 + 1;
            }
            else
            {
                count2 = count2;
            }
            counter1 = counter1 + 1;
            counter2 = counter2 + 1;
        }
        System.out.println("Number of Cs in " + s2 + ": " + count2);
        */
        
        //Example of using a while loop to process each character of a string
        //Find the number of Es in a String of text
        
        int count = 0;
        int pos = 0; //The position of the String
        while(s1.indexOf("e", pos) >= 0)
        {
            count++;
            pos = s1.indexOf("e", pos) + 1;
        }
        
        System.out.println("The word " + s1 + " has " + count + " E(s) in it.");
    }
}