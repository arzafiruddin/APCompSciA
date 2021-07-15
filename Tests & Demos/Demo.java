public class Demo
{
    public static void main(String [] args)
    {
        int x = 7;
        int y = x;
        y = y + 3;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
        
        //   When you set an object to another object without <new ____>,
        //   it'll add a nickname to that object
        //   (in this case t2 is set to a nickname for t1, A.K.A. t2 == t1)
        
        Team t1 = new Team("Whalers");
        Team t2 = t1;
        t2.setName("Hurricanes");
        System.out.println(t1.getName());
        
        //   Strings are a special case as they function similar to primitives
        
        
        String s1 = "Salter";
        String s2 = s1;
        System.out.println("BEFORE s2 is " + s2);
        s2 = "Miller";
        System.out.println("s1 is " + s1);
        System.out.println("AFTER s2 is " + s2);
        
    }
}