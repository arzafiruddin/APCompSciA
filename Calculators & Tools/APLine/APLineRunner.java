public class APLineRunner
{
    public static void main(String [] args)
    {
        System.out.println("JAVA APLINE CALCULATOR PROGRAM");
        System.out.println();
        
        APLine line1 = new APLine(5, 4, -17);
        /*
        double slope1 = line1.getSlope();
        System.out.println(slope1);
        boolean onLine1 = line1.isOnLine(5, -2);
        System.out.println(onLine1);
        */
        System.out.println("Equation 1 > " + line1.getEquation());
        System.out.println("Slope 1 > " + line1.printSlope());
        System.out.println("Is point (5,-2) on Line 1? " + line1.isOnLine(5, -2));
        
        System.out.println();
        
        APLine line2 = new APLine(-25, 40, 30);
        /*
        double slope2 = line2.getSlope();
        System.out.println(slope2);
        boolean onLine2 = line2.isOnLine(5, -2);
        System.out.println(onLine2);
        */
        System.out.println("Equation 2 > " + line2.getEquation());
        System.out.println("Slope 2 > " + line2.printSlope());
        System.out.println("Is point (5,-2) on Line 2? " + line2.isOnLine(5, -2));
        
        System.out.println();
    }
}