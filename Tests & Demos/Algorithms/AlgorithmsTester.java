public class AlgorithmsTester
{
    public static void main(String [] args)
    {
        int [] numbers = new int [7];
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = (int)(Math.random()*20) + 1;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println(Algorithms.linearSearch(numbers, 7));
        
        //Can no longer be done as 3-parameter method is no longer public
        //System.out.println(Algorithms.linearSearchRecursive(numbers, 7, 0));
        
        System.out.println(Algorithms.linearSearchRecursive(numbers, 7));
        
        int [] numbers2 = {1, 3, 7, 10, 12, 13};
        System.out.println();
        System.out.println(Algorithms.binarySearch(numbers2, 5));
        System.out.println(Algorithms.binarySearch(numbers2, 7));
    
        //System.out.println(Algorithms.binarySearchRecursive(numbers2, 5, 0, numbers.length));
        
        System.out.println(Algorithms.binarySearchRecursive(numbers2, 5));
        
        int [] toBeSorted = {7, 4, 9, 3, 5, 16, 59, 92};
        
        /*
        for(int i : toBeSorted)
            System.out.print(i + " ");
            
        Algorithms.selectionSort(toBeSorted);
        
        for(int i : toBeSorted)
            System.out.print(i + " ");
        */
        
        for(int i : toBeSorted)
            System.out.print(i + " ");
        System.out.println();
        
        Algorithms.insertionSort(toBeSorted);
        
        for(int i : toBeSorted)
            System.out.print(i + " ");
        System.out.println();
    }
}