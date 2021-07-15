public class test
{
    public static void main(String [] args)
    {
        String str = "Hello";
        
        for(int i = 0; i < 2; i++)
        {
        System.out.println(str.length());
        String str1 = str.substring(str.length()-1);
        System.out.println(str1);
        String str2 = str.substring(0,str.length()-1);
        System.out.println(str2);
        str = str1 + str2;
        System.out.println(str);
        }
        System.out.println();
        System.out.println(str);
    }
    
}