public class ParrotTester
{
    public static void main(String [] args)
    {
        Parrot birdy = new Parrot("Birdy");
        System.out.println(birdy.getName());
        System.out.println(birdy.getAge());
        birdy.incrementAge();
        System.out.println(birdy.getAge());
        birdy.train("Tweet, Tweet on the street!");
        System.out.println(birdy.speak());
        System.out.println(birdy.speak());
        
        PirateParrot polly = new PirateParrot("Polly");
        System.out.println(polly.getName());
        System.out.println(polly.getAge());
        polly.stealSoul(5);
        System.out.println(polly.getAge());
        System.out.println(polly.speak());
        polly.train("Walk the plank");
        polly.train("Off with his head");
        System.out.println(polly.speak());
        System.out.println(polly.speak());
        System.out.println(polly.speak());
        
    }
}