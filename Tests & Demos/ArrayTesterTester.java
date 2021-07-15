public class ArrayTesterTester
{
    public static void main(String [] args)
    {
        /**
         * hasAllValues TESTER
         */
        int [] arr1 = {0,1,2,3,4,5};
        int [] arr2 = {5,3,0,2,1,4};
        int [] arr3 = {0,1,2,4,5,5};
        
        System.out.println(ArrayTester.hasAllValues(arr1, arr2)); //true
        System.out.println(ArrayTester.hasAllValues(arr2, arr1)); //true
        System.out.println(ArrayTester.hasAllValues(arr1, arr3)); //false
        System.out.println(ArrayTester.hasAllValues(arr2, arr3)); //false
        
        /**
         * containsDuplicates TESTER
         */
        System.out.println(ArrayTester.containsDuplicates(arr1)); //false
        System.out.println(ArrayTester.containsDuplicates(arr2)); //false
        System.out.println(ArrayTester.containsDuplicates(arr3)); //true
        
        /**
         * getColumn TESTER
         */
        int [][] arr2D = { {0,1,2},
                           {3,4,5},
                           {6,7,8},
                           {9,0,0} };
        
        //WITHOUT toString(int [] arr)
        System.out.println(ArrayTester.getColumn(arr2D, 0)); //MEM Address
        System.out.println(ArrayTester.getColumn(arr2D, 1)); //MEM Address
        System.out.println(ArrayTester.getColumn(arr2D, 2)); //MEM Address
        System.out.println("result: " + ArrayTester.toString(ArrayTester.
        //WITH toString(int [] arr)
        getColumn(arr2D, 0))); //{0, 3, 6, 9}
        System.out.println("result: " + ArrayTester.toString(ArrayTester.
        getColumn(arr2D, 1))); //{1, 4, 7, 0}
        System.out.println("result: " + ArrayTester.toString(ArrayTester.
        getColumn(arr2D, 2))); //{2, 5, 8, 0}
        
        /**
         * isLatin TESTER
         */
        int [][] arrLat = { {1,2,3},
                            {2,3,1},
                            {3,1,2} };
        
        int [][] arrNLat = { {7,2,3},
                             {2,5,1},
                             {8,2,0} };
        
        System.out.println(ArrayTester.isLatin(arrLat)); //true
        System.out.println(ArrayTester.isLatin(arrNLat)); //false
    }
}