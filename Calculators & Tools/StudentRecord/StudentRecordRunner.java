public class StudentRecordRunner
{
    public static void main(String [] args)
    {
        int [] list1 = {0, 20, 40, 60, 80, 100};
        StudentRecord s1 = new StudentRecord(list1);
        
        int [] list2 = {90, 100, 90};
        StudentRecord s2 = new StudentRecord(list2);
        
        int [] list3 = {30, 90, 75, 85, 25};
        StudentRecord s3 = new StudentRecord(list3);
        
        int [] list4 = {30, 25, 40, 85, 90};
        StudentRecord s4 = new StudentRecord(list4);
        
        System.out.println(s1.average(2, 4)); //60.0
        System.out.println(s2.average(0, 2)); //93.333
        System.out.println(s3.average(1, 3)); //83.333
        
        System.out.println(s1.hasImproved()); //true
        System.out.println(s2.hasImproved()); //false
        System.out.println(s3.hasImproved()); //false
        
        System.out.println(s1.finalAverage()); //80
        System.out.println(s2.finalAverage()); //93.333
        System.out.println(s3.finalAverage()); //61.0
        System.out.println(s4.finalAverage()); //71.666
        
    }
}