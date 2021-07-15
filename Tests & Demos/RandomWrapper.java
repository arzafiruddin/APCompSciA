public class RandomWrapper
{
    public static void main(String [] args)
    {
        System.out.println("Random Value is: " + Math.random());
        
        //Random number between 0 and 9 inclusive
        int randValue = (int)(Math.random()*10);
        System.out.println("Random Value is: " + randValue);
        
        //Random number between 10 and 19 inclusive
        randValue = (int)(Math.random()*10)+10;
        System.out.println("Random Value is: " + randValue);
        
        //Math.random()*(range size) + offset
        //Math.abs(value)
        //Math.pow(base, exponent)
        //Math.sqrt(value)
        
        //Primitive & Class
        int i1 = 7;
        Integer value = new Integer(6);
        Integer value2 = new Integer(10);
        
        //Returns value LESS than 0 since 6<10
        System.out.println(value.compareTo(value2));
        
        //Returns value MORE than 0 since 6<10
        System.out.println(value2.compareTo(value));
        
        //Returns value 0 since 10 == 10
        System.out.println(value2.compareTo(value2));
        
        double d1 = 9;
        Double d2 = new Double(8.5);
        
        boolean b1 = true;
        //Boolean b2 = new Boolean(false);
        
        
        //parseInt converts a String to an Int
        String s1 = new String("badger 23");
        String numberPart = s1.substring(s1.indexOf(" ") + 1);
        int j = Integer.parseInt(numberPart);
        System.out.println(j+10);
        
        //Auto-Boxing Method > Storing primitive into class
        Integer v1 = 8; //Compiler converts to "new Integer(8)"
        
        //Auto-Unboxing Method > Taking primitive out of class
        int n = v1; //Comiler converts to "v1.intValue()"
    }
}