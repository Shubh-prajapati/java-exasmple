package coffee.Strings;


public class Strings {
    public static void main(String[] args) {


        //Empty()
//        String name=new String("first-string");
//        if(!name.isEmpty()){
//            System.out.println(name + "second-string");
//        }

        String sentence="this is my string-"; // Sentence is contain blank space
        String wordSets="words1 words2 words3 "; //set of words is contain blank space
        String blanks=" ";// only blanks Space


        System.out.println("isEmpty (sentence): "+sentence.isEmpty()) ;
        System.out.println("isEmpty (wordSet): "+wordSets.isEmpty());
        System.out.println("isEmpty (blanks): " +blanks.isEmpty());
        System.out.println("===============================================");

        // Line() Demo

//        sentence ="this\nis\nmy\nString"; // sentence contain the blank spaces
//        Stream<String> lines=sentence.lines();
//        lines.forEach(System.out::println);

        //strip vs trim() demo
        String WhitespaceString= "\n\t\u2005hey buddy\u2005";
        System.out.println("whitespaceString.trim() : "+WhitespaceString.trim());
        System.out.println("trim(): "+WhitespaceString.trim());
        System.out.println();


        //repeat() demo
//        String blah="blah ";
//        System.out.println("blah.repeat(3): "+blah.repeat(3));
//        System.out.println("blah.repeat(0)"+blah.repeat(0));
//        System.out.println("======================================");




//        // StripLeading() and stripTrailing()
//        String nextWhitespaceString= "\n\t\u2005hey buddy\u2005";
//        System.out.println("Actual String with white space : "+nextWhitespaceString);
//        System.out.println("String after striping leading WhitespaceString :"+nextWhitespaceString.);
//        System.out.println("=======================================================================================");

         String blah1=new String ("blah");
        System.out.println("blah.equal(blah1): "+ blah1.equals(blah1));
        System.out.println("blah== blah1):" +blah1==blah1);
        System.out.println("=====================================");

        byte[] blahBytes=blah1.getBytes();
        for (byte blahbyte : blahBytes)
        {
            System.out.println("blahbyte: "+blahbyte);
       }
        System.out.println("=====================================");


 






    }


}
