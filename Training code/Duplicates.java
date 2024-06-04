import java.util.*;
// Output:
// giiiinnnrsstt
// g - 1
// i - 4
// n - 3
// r - 1
// s - 2
// t - 2
class Duplicates {
    public static void main(String[] args) {
        String str = "sinstriiintng";
        char c[]= str.toCharArray();
        Arrays.sort(c);
        System.out.println(c);

        int[] counts = new int[26];

        for (int i = 0; i < str.length(); i++)
            counts[str.charAt(i) - 'a']++;

        for (int i = 0; i < 26; i++)
            if (counts[i] >= 1)
                System.out.println((char)(i + 'a') + " - " + counts[i]);
    }
}
