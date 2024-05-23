import java.util.*;
public class Challenge {
    public static int triangle(int n) {
        if (n>=1) {
            int y = (n * (n + 1)) / 2; // Removed the extra closing parenthesis
            return y; // Return the calculated value
        } else {
            return -1; // Return a special value to indicate invalid input
        }
    }

    public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Declare and read input
        int result = triangle(n); // Store the result in a variable
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("Invalid input");
        }
			        sc.close();
    }
}
