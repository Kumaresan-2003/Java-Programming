import java.util.*;
class MatrixZigzag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int i;
        for (i = 0; i < row; i++)
            if (i % 2 == 0) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = col - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            sc.close();
    }
}