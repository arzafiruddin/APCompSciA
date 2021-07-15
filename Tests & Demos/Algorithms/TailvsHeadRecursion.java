public class TailvsHeadRecursion
{
    public static void main(String [] args)
    {
        System.out.println("TAIL RECURSION:");
        tailPrint(6);
        System.out.println();
        System.out.println("HEAD RECURSION:");
        headPrint(6);
        System.out.println();
    }
    
    public static void tailPrint(int n)
    {
        if(n == 0)
            return;
        else
            System.out.print(n + " ");
            
        tailPrint(n-1);
    }
    
    public static void headPrint(int n)
    {
        if(n == 0)
            return;
        else
            headPrint(n-1);
            
        System.out.print(n + " ");
    }
}