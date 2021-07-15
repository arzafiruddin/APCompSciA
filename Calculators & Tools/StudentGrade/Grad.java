public class Grad extends Student
{
    private int myGradId;
    
    public Grad()
    {
        super();
        myGradId = 0;
    }
    
    public Grad(String name, int [] tests, String grade, int gradId)
    {
        super(name, tests, grade);
        myGradId = gradId;
    }
    
    public int getId()
    { return myGradId; }
    
    public void computeGrade()
    {
        super.computeGrade();
        if(this.getTestAverage() >= 90)
        { this.setGrade("Pass with DISTINCTION"); }
    }
    
    
    
    
    
}