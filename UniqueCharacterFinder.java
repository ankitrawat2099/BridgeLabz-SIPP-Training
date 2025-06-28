import java.util.*;

public class UniqueCharacterFinder {
    public static void main(String[] args) {
        String str = "programming";

        str = str.toLowerCase();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i=0;i<str.length();i++ ) { 
            char ch=str.charAt(i);
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        

        
        Set<Character> keys=map.keySet();
        for(Character key:keys) {
            if (map.get(key) == 1) {
                System.out.print(key);
            }
        }
    }
}
