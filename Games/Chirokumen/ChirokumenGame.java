import java.util.Scanner;

public class ChirokumenGame
{
    public static void main(String [] args)
    {
        Chirokumen poke1 = new Chirokumen("NO NAME");
        Chirokumen poke2 = new Chirokumen("Chirokumen");
        String tempA = "";
        int tempB = 0;
        int turn = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------------------------------------------");
        System.out.println("CHIROKUMEN: A Pokemon Story");
        System.out.println("------------------------------------------");
        pause(2);
        System.out.println("Welcome to CHIROKUMEN. Please enter a name");
        System.out.println("for your Pokemon below:");
        tempA = sc.nextLine();
        poke1.setName(tempA);
        tempA = "";
        System.out.println("");
        System.out.println("Your Pokemon: " + poke1.getName());
        System.out.println("");
        pause(1);
        System.out.println("WATCH OUT! A Chirokumen appeared!");
        pause(1);
        System.out.println("Prepare your Pokemon for battle...");
        System.out.println("------------------------------------------");
        pause(1);
        System.out.println("HOW TO PLAY:");
        pause(2);
        System.out.println("You will be displayed your and your");
        System.out.println("opponent's health along with the option to");
        System.out.println("either heal or attack.");
        System.out.println("");
        pause(2);
        System.out.println("You'll take turns either healing your");
        System.out.println("Pokemon or attacking your opponent until");
        System.out.println("either Pokemons' health reaches 0.");
        System.out.println("");
        pause(2);
        System.out.println("Enter [1] to attack. This randomly deplete");
        System.out.println("between 0 and 25 HP from your opponent.");
        System.out.println("");
        pause(2);
        System.out.println("Enter [2] to heal. This randomy heals");
        System.out.println("between 0 and 25 HP to your Pokemon.");
        System.out.println("");
        pause(2);
        System.out.println("Enter any character to BEGIN...");
        tempA = sc.nextLine();
        tempA = "";
        System.out.println("------------------------------------------");
        System.out.println("BATTLE BEGIN");
        System.out.println("");
        pause(1);
        while(poke1.getHealth() > 0 || poke2.getHealth() > 0)
        {
            pause(1);
            turn++;
            System.out.println("TURN " + turn);
            System.out.println("-------------------------");
            System.out.println("Pokemon: " + poke1.getName());
            System.out.println("HP: " + poke1.getHealth());
            System.out.println("-------------------------");
            System.out.println("Opponent: " + poke2.getName());
            System.out.println("HP: " + poke2.getHealth());
            System.out.println("-------------------------");
            pause(1);
            if(turn%2 == 0)
            {
                System.out.println(">> OPPONENT TURN <<");
                pause(1);
                System.out.println(poke1.getName() + " took damage.");
                poke1.takeDamage();
                System.out.println("");
                System.out.println("");
                pause(2);
            }
            else
            {
                System.out.println(">> YOUR TURN <<");
                System.out.println("[1]: Attack");
                System.out.println("    or");
                System.out.println("[2]: Heal");
                System.out.println("    or");
                System.out.println("Any: Quit ");
                tempB = sc.nextInt();
                
                if(tempB==1)
                {
                    poke2.takeDamage();
                    pause(1);
                    System.out.println(poke2.getName() + " took damage.");
                    System.out.println("");
                    System.out.println("");
                    pause(2);
                }
                else if(tempB==2)
                {
                    poke1.heal();
                    pause(1);
                    System.out.println(poke1.getName() + " healed some health.");
                    System.out.println("");
                    System.out.println("");
                    pause(2);
                }
            }
        }
        if(poke1.isDead())
        {
            System.out.println("Y");
            pause(1);
            System.out.print("O");
            pause(1);
            System.out.print("U");
            pause(1);
            System.out.print(" ");
            pause(1);
            System.out.print("L");
            pause(1);
            System.out.print("O");
            pause(1);
            System.out.print("S");
            pause(1);
            System.out.print("T");
            pause(1);
            System.out.println("Your Pokemon has been lost in battle.");
            System.out.println("RIP " + poke1.getName());
        }
        else if(poke2.isDead())
        {
            System.out.println("Y");
            pause(1);
            System.out.print("O");
            pause(1);
            System.out.print("U");
            pause(1);
            System.out.print(" ");
            pause(1);
            System.out.print("W");
            pause(1);
            System.out.print("O");
            pause(1);
            System.out.print("N");
            pause(1);
            System.out.println("Your Pokemon lives on to battle another day.");
            System.out.println(poke1.getName() + " is VICTORIOUS!");
        }
    }
    
    private static void pause(long seconds)
   {
      try{
         Thread.sleep(seconds*1000);
      }catch(InterruptedException e){}
   }
}