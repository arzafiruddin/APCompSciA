public class Boolean
{
    public static void main(String [] arg)
    {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        
        //AND
        System.out.println(a && b);
        //OR
        System.out.println(a || b);
        //EQUAL
        System.out.println(a == b);
        //NOT EQUAL
        System.out.println(a != b);
        //NOT
        System.out.println(!a);
        
        //Declares constant for Pi
        final double PI_VALUE = 3.14159;
        
        System.out.println("Area: " + PI_VALUE*3*3);
    }
}