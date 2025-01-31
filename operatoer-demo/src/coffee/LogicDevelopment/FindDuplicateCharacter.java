package coffee.LogicDevelopment;
import java.util.HashMap;
import java.util.Set;
public class FindDuplicateCharacter {
    public static void main(String[] args) {
        duplicateCharterCount("Learn Java Programing");
    }

    private static void duplicateCharterCount(String inputString) {

        HashMap<Character, Integer> charCountMap=new HashMap<>();
        char[] srtArray=inputString.toCharArray();
        for(char c:srtArray){
            if(charCountMap.containsKey(c)){
                charCountMap.put(c, charCountMap.get(c)+ 1);
            }else {
                charCountMap.put(c, 1);
            }
        }

        Set<Character> charInString= charCountMap.keySet();
        System.out.println("Duplicate Character in: "+inputString);

        for(Character ch: charInString){
            if (charCountMap.get(ch)>1){
                System.out.println(ch +": "+ charCountMap.get(ch));
            }
        }

    }
}
