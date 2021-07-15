public class PetTester
{
    public static void main(String [] args)
    {
        Pet [] animals = new Pet[4];
        
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Fish();
        animals[3] = new Snake();
        
        for(Pet p: animals)
        {
            p.speak();
        }
        
        //Pet john = new Pet(); Cannot do this as Pet is now an Abstract
        //                      class and cannot be independently created
        
        
    }
}