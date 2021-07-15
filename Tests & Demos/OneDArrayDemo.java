/**
 * OneDArrayDemo.java
 * 
 * A demo of interacting with arrays.
 * Array are Java's version of lists in Snap!
 * 
 */
 public class OneDArrayDemo
 {
     public static void main(String [] args)
     {
        /*
        Declaring and filling an array at the same time.
        Can only be done with fixed values, no variables.
        */
        int [] nums = {1, 3, 5, 6, 7};
        
        /*
        <array name>.length gives the number of elements in the array
        NOTE: No parentheses after length. It is a class variable, not a
        method. Example below prints 5 because there are 5 elements.
        */
        System.out.println("The length of the array is " + nums.length);
        
        /*
        Array elements are indexed from 0 length to length-1. The code below
        prints the second item in the array.
        */
        System.out.println("The second value in the array is " + nums[1]);
        
        /*
        To acces individual items, use the following format:
            <array name>[<element index>]
        */
        
        /*
        The code below changes the last value in the array and prints it out
        */
        nums[nums.length-1] = 15;
        System.out.println("The is last value in the array is " + nums[nums.length-1]);
        
        /*
        Example of printing out all elements in the array ising a for loop.
        */
        System.out.print("The entire array is ");
        for(int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
        System.out.println(); 
        
        /*
        Array can be of any type. Below is an example of creating a String array
        of length 4. When object arrays are created, each object in the array is
        set to null until instantiated.
        */
        String [] names = new String[4];
        
        /*
        This will print a null since the list hasn't been created yet
        */
        System.out.println(names[2]);
        
        /*
        This will case a NullPointException error since the String hasn't been
        created yet. Uncomment the next line to see.
        */
        /////System.out.println(names[2].length());
        
        /*
        Example of setting the names in the String [].
        */
        names[0] = "Steve";
        names[1] = "Frank";
        names[2] = "John";
        names[3] = new String ("Bob");
        
        /*
        Causes an ArrayIndexOutOfBoundsException since the array names is only
        length 4. Uncommment the next line to see.
        */
        /////names[4] = "Dave";
        
        /*
        Example of printing all the names
        */
        System.out.println("The names in the array are: ");
        for(int i = 0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }
        
        /*
        The follwoing does not copy the array. Arrays are like objectss. When
        you do the following, it creates an alias. So now, the identifiers
        people and names refer to the same array.
        */
        String [] people = names;
        System.out.println(people[1] + " is the same as " + names[1]);
        
        /*
        Here is how you can copy an array.
        */
        people = new String [names.length];
        for(int i = 0; i < names.length; i++)
        {
            people[i] = names[i];
        }
        
        people[1] = "Kari";
        System.out.println(people[1] + " is different than " + names[1]);
        
        
        
        
        
        
        
        
     }
 }