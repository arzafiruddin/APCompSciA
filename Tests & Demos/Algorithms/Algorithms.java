public class Algorithms
{
    // Searches the provided array for the given value and returns the index of
    // the value in the array if found, -1 otherwise
    public static int linearSearch(int [] nums, int value)
    {
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == value)
                return i;
        }
        return -1;
    }
    
    //Driver method for linear search recursive function
    public static int linearSearchRecursive(int [] nums, int value)
    {
        return linearSearchRecursive(nums, value, 0);
    }
    
    //Helper method for linear search recursive function
    private static int linearSearchRecursive(int [] nums, int value, int index)
    {
        if(index == nums.length)
            return -1;
        else if(nums[index] == value)
            return index;
        
        return linearSearchRecursive(nums, value, index + 1);
    }
    
    public static int binarySearch(int [] nums, int value)
    {
        int min = 0;
        int max = nums.length-1;
        int mid = 0;
        while(min < max)
        {
            mid = (min + max)/2;
            if(nums[mid] == value)
              return mid;
            else if(value < nums[mid])
                max = mid-1;
            else
                min = mid+1;
        }
        return -1;
    }
    
    //Driver
    public static int binarySearchRecursive(int [] nums, int value)
    {
        return binarySearchRecursive(nums, value, 0, nums.length);
    }
    
    //Helper
    public static int binarySearchRecursive(int [] nums, int value, int min, int max)
    {
        int mn = min;
        int mx = max;
        int mid = (min + max)/2;
        if(max < min)
            return -1;
        else
        {
            if(mid == value)
                return mid;
            else if(value < nums[mid])
                return binarySearchRecursive(nums, value, min, mid-1);
            else
                return binarySearchRecursive(nums, value, mid+1, max);
        }
    }
    
    //NEED TO BE REVISED
    /*
    public static void selectionSort(int [] nums)
    {
        int min, temp;
        for(int i = 0; i < nums.length-1; i++)
        {
            min = i;
            for(int j = i; i < nums.length; i++)
            {
                if(nums[j] < nums[min])
                    min = j;
            }
            temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }
    */
    
    public static void insertionSort(int [] nums)
    {
        int temp;
        for(int i = 1; i < nums.length; i++)
        {
            while(i != 0 && nums[i-1] > nums[i])
            {
                temp = nums[i];
                nums[i] = nums[i-1];
                nums[i-1] = temp;
                i--;
            }
        }
    }
    
    public static void mergeSort(int [] nums)
    {
        //if there is one or nothing in the array, return.
        if(nums.length <= 1)
            return;
        
        int [] first = new int[nums.length/2];
        int [] second = new int[nums.length - first.length];
        
        //Copy the first half of nums to first, second half of nums to second
        for(int i = 0; i < first.length; i++)
            first[i] = nums[i];
        
        for(int i = 0; i < second.length; i++)
            second[i] = nums[first.length+i];
        
        mergeSort(first);
        mergeSort(second);
        
        merge(nums, first, second);
    }
    
    private static void merge(int [] nums, int [] first, int [] second)
    {
        int iFirst = 0; //Next element to consider in the first array
        int iSecond = 0; //Next element to consider in the second array
        int j = 0; //Next open position in nums
        
        //As long as neither iFirst or iSecond are past the end, move the
        //smaller element into nums
        while(iFirst < first.length && iSecond < second.length)
        {
            if(first[iFirst] < second[iSecond])
            {
                nums[j] = first[iFirst];
                iFirst++;
            }
            else
            {
                nums[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }
        
        //Dump anything left in the first array into nums
        while(iFirst < first.length)
            nums[j] = first[iFirst];
            iFirst++;
            j++;
        
        //Dump anythign left in the second array into nums
        while(iSecond < second.length)
            nums[j] = second[iSecond];
            iSecond++;
            j++;
    }
}