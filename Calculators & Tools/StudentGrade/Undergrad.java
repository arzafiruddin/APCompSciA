public class Undergrad extends Student
{
    public Undergrad()
    {
        super();
    }
    
    public Undergrad(String name, int [] tests, String grade)
    {
        super(name, tests, grade);
    }
    
    //Overrides the computeGrade() method from the Student class
    public void computeGrade()
    {
        //myTests = new int [] {100, 100, 100};
        if(this.getTestAverage() >= 70)
        { this.setGrade("Pass"); }
        else
        { this.setGrade("Fail"); }
    }
    
}