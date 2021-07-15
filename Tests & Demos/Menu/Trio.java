public class Trio implements MenuItem
{
    private Sandwhich sandwhich;
    private Salad salad;
    private Drink drink;
    
    public Trio(Sandwhich sand, Salad sd, Drink dk)
    {
        sandwhich = sand;
        salad = sd;
        drink = dk;
    }
    
    public String getName()
    {
        return sandwhich.getName() + "/" + salad.getName() + "/" + drink.getName() + "Trio";
    }
    
    public double getPrice()
    {
        double price = 0.00;
        if(sandwhich.getPrice() >= salad.getPrice() && sandwhich.getPrice() >= drink.getPrice())
        {
            price += sandwhich.getPrice();
        }
        if(salad.getPrice() >= sandwhich.getPrice() && salad.getPrice() >= drink.getPrice())
        {
            price += salad.getPrice();
        }
        if(drink.getPrice() >= sandwhich.getPrice() && drink.getPrice() >= salad.getPrice())
        {
            price += drink.getPrice();
        }
        return price;
    }
}