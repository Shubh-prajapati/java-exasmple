package coffee.LogicDevelopment;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {
    public static void main(String[] args) {
        String input = "How many character are present in the Sentences";
        duplicateCharacterCount(input);
    }

    private static void duplicateCharacterCount(String input) {
        // Use Integer for counting occurrences
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert string to char array
        char[] characters = input.toCharArray();

        // Count each character
        for (char c : characters) {
            if (Character.isWhitespace(c)) {
                continue; // skip spaces if not needed
            }
            // Initialize or increment count
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print duplicates
        System.out.println("Duplicate characters in: " + input);
        Set<Character> keys = charCountMap.keySet();
        for (Character ch : keys) {
            int count = charCountMap.get(ch);
            if (count > 1) {
                System.out.println(ch + " : " + count);
            }
        }
    }
}