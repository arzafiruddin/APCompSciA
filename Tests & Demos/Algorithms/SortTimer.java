public class SortTimer
{
    public static void main(String [] args)
    {
        int [] randVals = new int[100000];
        for(int i = 0; i < randVals.length; i++)
            randVals[i] = (int)(Math.random()*100000)+1;
        
        long time = System.currentTimeMillis();
        Algorithms.mergeSort(randVals);
        time = System.currentTimeMillis() - time;
        time = time/1000;
        System.out.println("Sorted in " + time + " seconds");
        
        
    }
}