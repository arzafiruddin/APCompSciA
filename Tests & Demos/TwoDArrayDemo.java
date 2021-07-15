public class TwoDArrayDemo
{
    public static void main(String [] args)
    {
        //Two-D Array with 5 rows and columns
        //Java uses row-major order to store arrays
        //Basically, there are 5 int arrays of 4 length each
        int [][] nums = new int [5][4];
        
        for(int i = 0; i < nums.length; i++) //nums.length = 5
        {
            for(int j = 0; j < nums[i].length; j++) //nums[0].length = 4
            {
                nums[i][j] = (int)(Math.random()*50);
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println(search2D(nums, 10));
    }
    
    public static String search2D(int [][] nums, int target)
    {
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums[i].length; j++)
            {
                if(nums[i][j] == target)
                    return i + " " + j;
            }
        }
        return "item not found";
    }
}