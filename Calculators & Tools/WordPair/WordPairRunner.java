public class WordPairRunner
{
    public static void main(String [] args)
    {
        String [] listOfWords1 = {"one", "two", "three"};
        WordPairList pairs1 = new WordPairList(listOfWords1);
        System.out.println(pairs1.toString());
        System.out.println(pairs1.numMatches());
        
        System.out.println();
        
        String [] listOfWords2 = {"the", "more", "the", "merrier"};
        WordPairList pairs2 = new WordPairList(listOfWords2);
        System.out.println(pairs2.toString());
        System.out.println(pairs2.numMatches());
        
        System.out.println();
        
        String [] listOfWords3 = {"the", "red", "fox", "the", "red"};
        WordPairList pairs3 = new WordPairList(listOfWords3);
        System.out.println(pairs3.toString());
        System.out.println(pairs3.numMatches());
    }
}