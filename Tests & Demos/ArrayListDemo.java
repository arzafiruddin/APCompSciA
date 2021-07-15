import java.util.ArrayList;
public class ArrayListDemo
{
    public static void main(String [] args)
    {
        
        //Format ArrayList<TYPE> identifier = new ArrayList<TYPE>();
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        //Returns the number of items in the ArrayList
        System.out.println("There are currently " + nums.size() + " things in the list");
        
        //Add specified item to the end of the list
        nums.add(new Integer(14));
        System.out.println("There are currently " + nums.size() + " things in the list");
        
        //Randomly adds 9 random values between 0-19 inclusively to the list
        for(int i = 0; i < 9; i++)
        {
            nums.add(new Integer((int)(Math.random()*20)));
        }
        System.out.println("There are currently " + nums.size() + " things in the list");
        
        //toString() override is already built into ArrayList
        //Prints out entire list, objects separated by commas and bracketted.
        System.out.println(nums);
        
        //Names the item in the list with specified index
        System.out.println("The third item in the list is " + nums.get(2));
        
        //Add a new item into the list in specified index
        nums.add(2, new Integer(45));
        System.out.println(nums);
        System.out.println("The third item in the list is " + nums.get(2));
        
        //Replaces exisiting item in specified index with new item
        nums.set(2, new Integer(99));
        System.out.println(nums);
        System.out.println("The third item in the list is " + nums.get(2));
        
        //Returns true/false based on if the list is empty
        System.out.println("Is the ArrayList empty?" + nums.isEmpty());
        
        //Clear out the entire list
        nums.clear();
        System.out.println("Is the ArrayList empty?" + nums.isEmpty());
        
        
        
    }
}