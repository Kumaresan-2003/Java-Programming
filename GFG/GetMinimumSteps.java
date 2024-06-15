package kumar;
import java.util.Scanner;

public class GetMinimumSteps{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the box
        int M = scanner.nextInt();
        int N = scanner.nextInt();

        // Input the position and direction of the first ball
        int[] position1 = new int[]{scanner.nextInt(), scanner.nextInt()};
        int[] direction1 = new int[]{scanner.nextInt(), scanner.nextInt()};

        // Input the position and direction of the second ball
        int[] position2 = new int[]{scanner.nextInt(), scanner.nextInt()};
        int[] direction2 = new int[]{scanner.nextInt(), scanner.nextInt()};

        // Calculate the minimum steps for the balls to overlap
        int steps = getMinimumSteps(M, N, position1, direction1, position2, direction2);

        // Output the result
        if (steps == -1) {
            System.out.println("Never");
        } else {
            System.out.println(steps);
        }
    }

    private static int getMinimumSteps(int M, int N, int[] position1, int[] direction1, int[] position2, int[] direction2) {
        // Calculate the minimum steps for the balls to overlap
        for (int steps = 0; steps <= M * N; steps++) {
            position1[0] += direction1[0];
            position1[1] += direction1[1];

            position2[0] += direction2[0];
            position2[1] += direction2[1];

            if (position1[0] == position2[0] && position1[1] == position2[1]) {
                return steps + 1; // Adding 1 to include the overlapping position
            }

            // Check if the balls will never overlap
            if (position1[0] < 0 || position1[0] >= M || position1[1] < 0 || position1[1] >= N ||
                position2[0] < 0 || position2[0] >= M || position2[1] < 0 || position2[1] >= N) {
                return -1;
            }
        }

        return -1; // If the balls never overlap within the given number of steps
    }
}
