public class CipherTester
{
    public static void main(String [] args)
    {
        RouteCipher code1 = new RouteCipher("Hello", 3, 3);
        RouteCipher code2 = new RouteCipher("The End is Nie", 3, 3);
        
        System.out.println(code1.printArray());
        System.out.println(code2.printArray());
        
        RouteCipher code3 = new RouteCipher(2, 3);
        
        System.out.println(code3.encryptMessage("Meet me at midnight"));
    }
}