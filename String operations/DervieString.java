import java.util.Scanner;

public class String1 {
    public static String deriveStringC(String A, String B) {
        StringBuilder result = new StringBuilder();

        for (char c : A.toCharArray()) {
            if (B.indexOf(c) == -1) {
                // skip the value of string if letter is not present 
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String A = scanner.nextLine();
        String B = scanner.nextLine();

        String C = deriveStringC(A, B);

        System.out.println(C);
    }
}