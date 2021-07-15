public class ChirokumenRunner
{
    public static void main(String [] args)
    {
        Chirokumen puka = new Chirokumen("pika");
        
        System.out.println(puka.getName());
        puka.setName("puka");
        System.out.println(puka.getName());
        
        System.out.println(puka.getHealth());
        puka.takeDamage();
        System.out.println(puka.getHealth());
        puka.takeDamage();
        System.out.println(puka.getHealth());
        puka.heal();
        System.out.println(puka.getHealth());
        puka.heal();
        System.out.println(puka.getHealth());
    }
}