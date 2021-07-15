public class EnhancedForLoopDemo
{
    public static void main(String [] args)
    {
        //Calculate the sum of all the values in the array.
        int [] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int i: values) //for(<type> <identifier>: <array name>)
        {
            sum += i;
        }
        
        System.out.println(sum);
        
        String [] names = new String[5];
        names[0] = "Franklin, Frank";
        names[1] = "Allen, Alan";
        names[2] = "Johnson, John";
        names[3] = "Jackson, Jack";
        names[4] = "Stevenson, Steve";
        
        for(String n: names)
        {
            //Prints out just the last names
            System.out.println(n.substring(0, n.indexOf(",")));
        }
    }
}