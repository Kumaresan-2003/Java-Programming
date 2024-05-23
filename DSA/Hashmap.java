import java.util.*;
class Hashmap {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        String s = "aasjjikkk";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer val = map.get(c);
            if (val != null) {
                map.put(c, val + 1);
            } else {
                map.put(c, 1);
            }
        }

    }
}