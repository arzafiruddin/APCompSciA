import java.util.ArrayList;

public class ArraysVsArrayLists
{
    public static void main(String [] args)
    {
        
        //Creating Array vs ArrayList
        String [] namesArray = new String[5];
        
        ArrayList<String> namesList = new ArrayList<String>();
        
        //Add values to Array vs ArrayList
        namesArray[0] = "Phillip";
        namesArray[1] = "Steve";
        namesArray[2] = "Frank";
        namesArray[3] = "Frank";
        namesArray[4] = "Dave";
        
        namesList.add("Phillip");
        namesList.add("Steve");
        namesList.add("Frank");
        namesList.add("Frank");
        namesList.add("Dave");
        
        //Prints out all of the values for Array vs ArrayList
        for(int i = 0; i < namesArray.length-1; i++)
        {
            System.out.println(namesArray[i]);
        }
        
        System.out.println();
        
        for(int i = 0; i < namesList.size(); i++)
        {
            System.out.println(namesList.get(i));
        }
        
        System.out.println();
        
        //Removes Frank
        for(int i = 0; i < namesArray.length; i++)
        {
            if(namesArray[i].equals("Frank"))
            {
                namesArray[i] = null;
            }
        }
        for(int i = 0; i < namesArray.length; i++)
        {
            System.out.println(namesArray[i]);
        }
        
        System.out.println();
        
        for(int i = 0; i < namesList.size(); i++)
        {
            if(namesList.get(i).equals("Frank"))
            {
                namesList.remove(i);
                if(namesList.get(i).equals("Frank"))
                {
                    namesList.remove(i);
                }
            }
        }
        for(int i = 0; i < namesList.size(); i++)
        {
            System.out.println(namesList.get(i));
        }
        
    }
}
