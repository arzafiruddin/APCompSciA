import java.util.ArrayList;
public class ShapeTester
{
    public static void main(String [] args)
    {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        
        Circle c1 = new Circle(5);
        Circle c2 = new Circle("c2", 10);
        Square s1 = new Square(5);
        Square s2 = new Square("s2", 10);
        
        shapes.add(c1);
        shapes.add(c2);
        shapes.add(s1);
        shapes.add(s2);
        
        System.out.print(shapes);
    }
}