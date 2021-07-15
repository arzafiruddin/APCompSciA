import java.util.Scanner;

public class QBRating
{
    public static void main(String [] arg)
    {
        System.out.println("-------------------------------------------------");
        System.out.println("JAVA QUARTERBACK RATING");
        System.out.println("");
        
        int att, comp, yds, td, in;
        String name;
        double a, b, c, d, rating;
        
        a = 1;
        b = 1;
        c = 1;
        d = 1;
        
        Scanner sc;
        
        sc = new Scanner(System.in);
        
        System.out.println("What is the quarterback's name?");
        name = sc.nextLine();
        System.out.println("");
        
        System.out.println("What was their number of touchdown passes?");
        td = sc.nextInt();
        System.out.println("");
        
        System.out.println("What was their number of passed attempts?");
        att = sc.nextInt();
        System.out.println("");
        
        System.out.println("What was their number of completions?");
        comp = sc.nextInt();
        System.out.println("");
        
        System.out.println("What was their amount of passing yards?");
        yds = sc.nextInt();
        System.out.println("");
        
        System.out.println("What was their number of interceptions?");
        in = sc.nextInt();
        System.out.println("");
        
        a = ((double)comp/att - 0.3)*5;
        if(a >= 2.375)
        {
            a = 2.375;
        }
        else if(a <= 0)
        {
            a = 0;
        }
        else
        {
            a = a;
        }
        b = ((double)yds/att - 3)*0.25;
        if(b >= 2.375)
        {
            b = 2.375;
        }
        else if(b <= 0)
        {
            b = 0;
        }
        else
        {
            b = b;
        }
        c = ((double)td/att)*20;
        if(c >= 2.375)
        {
            c = 2.375;
        }
        else if(c <= 0)
        {
            c = 0;
        }
        else
        {
            c = c;
        }
        d = 2.375 - ((double)in/att*25);
        if(d >= 2.375)
        {
            d = 2.375;
        }
        else if(d <= 0)
        {
            d = 0;
        }
        else
        {
            d = d;
        }
        
        rating = ((a+b+c+d)/6)*100;
        
        System.out.println("Quarterback Rating Summary");
        System.out.println("");
        System.out.println("Quarterback: " + name);
        System.out.println("Completions: " + comp);
        System.out.println("Attempts: " + att);
        System.out.println("Touchdowns: " + td);
        System.out.println("Interceptions: " + in);
        System.out.println("Rating: " + rating);
        
        if(rating < 75)
        {
            System.out.println(name + " had a bad game.");
        }
        else if(rating >= 75 && rating < 90)
        {
            System.out.println(name + " had an okay game.");
        }
        else if(rating >= 90 && rating < 100)
        {
            System.out.println(name + " had a good game.");
        }
        else if(rating >= 100 && rating < 120)
        {
            System.out.println(name + " had a great game.");
        }
        else if(rating > 120)
        {
            System.out.println(name + " had a amazing game.");
        }
        else
        {
            System.out.println("ERROR");
        }
        
        System.out.println("-------------------------------------------------");
    }
}