public class MultPractice implements StudyPractice
{
    public final int FIRST_INT;
    public int initialSecondInt;
    
    public MultPractice(int x, int y)
    {
        FIRST_INT = x;
        initialSecondInt = y;
    }
    
    public String getProblem()
    {
        return FIRST_INT + "TIMES" + initialSecondInt;
    }
    
    public void nextProblem()
    {
        initialSecondInt++;
    }
}