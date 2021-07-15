public class PracticeTester
{
    public static void main(String [] args)
    {
        StudyPractice multPrac = new MultPractice(2, 0);
        
        System.out.println(multPrac.getProblem());
        multPrac.nextProblem();
        System.out.println(multPrac.getProblem());
        System.out.println(multPrac.getProblem());
        multPrac.nextProblem();
        System.out.println(multPrac.getProblem());
        multPrac.nextProblem();
        System.out.println(multPrac.getProblem());
        multPrac.nextProblem();
        System.out.println(multPrac.getProblem());
        System.out.println(multPrac.getProblem());
    }
}