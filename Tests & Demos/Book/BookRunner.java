public class BookRunner
{
    public static void main(String [] args)
    {
        System.out.println("JAVA BOOK METHOD PROGRAM");
        System.out.println();
        
        Book b1 = new Book("The Adventures of TinTin", "Herge");
        Book b2 = new Book("The Adventures of TinTin");
        Book b3 = new Book();
        Book b4 = new Book("The Adventures of TinTin", "Herge");
        
        System.out.println("Book 1 > Title: " + b1.getTitle() + " | Author: " + 
        b1.getAuthor());
        System.out.println("Book 2 > Title: " + b2.getTitle() + " | Author: " + 
        b2.getAuthor());
        System.out.println("Book 3 > Title: " + b3.getTitle() + " | Author: " + 
        b3.getAuthor());
        
        System.out.println();
        
        System.out.println("Book 1 > " + b1);
        System.out.println("Book 2 > " + b2);
        System.out.println("Book 3 > " + b);
        
        System.out.println(b1.equals(b4));
        
        System.out.println();
    }
}