// Example 2:
// Input1:4
// Input2: 4
// Input3: {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4}
// Output: 26
// Explanation:
// The array has 4 rows (input1) and 4 columns (input2). The largest sum among the four columns is 10 and the largest sum among the //four rows is 16. We get the final sum of 26 (10+16).
import java.util.Scanner;
public class RowcolSum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] Matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                Matrix[i][j] = scanner.nextInt();
            }
        }

        int Row = 0;
        for (int i = 0; i < N; i++) {
            int sum = 0;
            for (int j = 0; j < M; j++) {
                sum += Matrix[i][j];
            }
            if (Row < sum) {
                Row = sum;
            }
        }

        int Column = 0;
        for (int i = 0; i < M; i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                sum += Matrix[j][i];
            }
            if (Column < sum) {
                Column = sum;
            }
        }

        int sum = Row + Column;
        System.out.println(sum);

        scanner.close();
    }
}