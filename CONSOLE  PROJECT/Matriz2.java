class Matriz2{
    static int[][] matrix = {
        {0, 1, 2, 0},
        {3, 4, 5, 2},
        {1, 3, 1, 5}
    };
    static int rowlength = matrix.length;
    static int collength = matrix[0].length;

    // Set matrix to zero
    public static void main(String [] args){
        int[] row = new int[rowlength];
        int[] col = new int[collength];

        for(int i=0;i<rowlength;i++){
            for(int j=0;j<collength;j++){
                if(matrix[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0;i<rowlength;i++){
            for(int j=0;j<collength;j++){
                if(row[i] == 1 || col[j] == 1){
                    matrix[i][j] = 0;
                }
            }
        }

        // Print the resulting matrix
        for(int i=0;i<rowlength;i++){
            for(int j=0;j<collength;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}