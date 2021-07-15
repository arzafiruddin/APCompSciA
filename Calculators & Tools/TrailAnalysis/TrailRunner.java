public class TrailRunner
{
    public static void main(String [] args)
    {
        Trail hike = new Trail();
        
        System.out.println(hike.isLevelTrailSegment(0, 4)); //false
        System.out.println(hike.isLevelTrailSegment(7, 10)); //true
        System.out.println(hike.isLevelTrailSegment(0, 12)); //false
        System.out.println(hike.isLevelTrailSegment(10, 11)); //true
        System.out.println();
        System.out.println(hike.isDifficult()); //true
        System.out.println();
        System.out.println(hike.findMaxElevation()); //150
        System.out.println(hike.findMaxElevation(0, 3)); //150
        System.out.println(hike.findMaxElevation(5, 9)); //80
        System.out.println(hike.findMaxElevation(10, 12)); //100
        System.out.println();
        System.out.println(hike.findMinElevation()); //50
        System.out.println(hike.findMinElevation(0, 3)); //100
        System.out.println(hike.findMinElevation(5, 9)); //50
        System.out.println(hike.findMinElevation(10, 12)); //80
    }
}