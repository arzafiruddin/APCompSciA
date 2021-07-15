public class CrosswordTester
{
    public static void main(String [] args)
    {
        /*
        boolean [][] blk = { {true,false,false},
                             {false,false,true},
                             {false,false,false},
                             {false,false,true} };
        
        System.out.println(Crossword.toBeLabeled(0,0,blk)); //false
        System.out.println(Crossword.toBeLabeled(0,1,blk)); //true
        System.out.println(Crossword.toBeLabeled(0,2,blk)); ///true
        System.out.println(Crossword.toBeLabeled(1,0,blk)); //true
        System.out.println(Crossword.toBeLabeled(1,1,blk)); //false
        System.out.println(Crossword.toBeLabeled(1,2,blk)); //false
        System.out.println(Crossword.toBeLabeled(2,0,blk)); ///true
        System.out.println(Crossword.toBeLabeled(2,1,blk)); //false
        System.out.println(Crossword.toBeLabeled(2,2,blk)); //true
        System.out.println(Crossword.toBeLabeled(3,0,blk)); //true
        System.out.println(Crossword.toBeLabeled(3,1,blk)); //false
        System.out.println(Crossword.toBeLabeled(3,2,blk)); //false
        */
        
        System.out.println("Checking Crossword");
        boolean [][] bs = new boolean [7][9];
        for(int i = 0; i<bs.length; i++)
            for(int j = 0; j<bs[0].length; j++)
              bs[i][j] = false;
         
        bs[0][0] = true; bs[0][3] = true; bs[0][4] = true; bs[0][5] = true;
        bs[1][4] = true; bs[2][6] = true; bs[2][7] = true; bs[2][8] = true;
        bs[3][2] = true; bs[3][6] = true; bs[4][0] = true; bs[4][1] = true;
        bs[4][2] = true; bs[5][4] = true; bs[6][3] = true; bs[6][4] = true;
        bs[6][5] = true; bs[6][8] = true;
        
        Crossword puz = new Crossword(bs);
        System.out.println(puz.toString());
        
        System.out.println();
    }
}