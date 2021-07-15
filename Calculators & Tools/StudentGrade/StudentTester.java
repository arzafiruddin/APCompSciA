public class StudentTester
{
    public static void main(String [] args)
    {
        Student s1 = new Student();
        Student s2 = new Student("Francine", new int [] {80, 80, 44}, "");
        
        s2.computeGrade();
        System.out.println(s2.getTestAverage());
        System.out.println(s2.getGrade());
        
        ////
        
        System.out.println();
        
        Undergrad u1 = new Undergrad();
        Undergrad u2 = new Undergrad("Jacob", new int [] {100, 100, 4}, "");
        
        u2.computeGrade();
        System.out.println(u2.getTestAverage());
        System.out.println(u2.getGrade());
        
        ////
        
        System.out.println();
        
        Grad g1 = new Grad();
        Grad g2 = new Grad("Megha", new int [] {90, 95, 88}, "", 12);
        
        g2.computeGrade();
        System.out.println(g2.getTestAverage());
        System.out.println(g2.getGrade());
        
        ////
        
        System.out.println();
        
        Student [] classroom = new Student[5];
        
        classroom[0] = new Student();
        classroom[1] = new Undergrad();
        classroom[2] = new Grad();
        classroom[3] = new Student("Ginger", new int [] {4, 8, 11}, "");
        classroom[4] = new Grad("Bella", new int [] {90, 95, 93}, "", 0);
        
        // Demonstration of POLYMORPHISM
        for(Student s: classroom)
        {
            s.computeGrade();
            System.out.println("Grade: " + s.getGrade());
        }
        
        ////
        
        
        
        
    }
}