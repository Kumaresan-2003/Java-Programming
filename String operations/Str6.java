public class Str6 {
    // Patternsearching in Patricular String with Another.
    public static void main(String[] args) {
        String s1 = "for";
        String s2 = "geeksforgeeks";
        int res = po1.op3(s1, s2);
        if (res == -1)
            System.out.println("Not present");
        else
            System.out.println("Present at index " + res);

    }
}

class po1 {
    static int op3(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        for (int i = 0; i < n; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (s2.charAt(i + j) != s1.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                return i;
            }
        }
        return -1;
    }
}
