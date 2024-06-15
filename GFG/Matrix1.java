public class Matrix1{
    /*Algorithm --Richest Customer Wealth 
    1.declare the 2D array 
    2. intilaizee Maxsum for storing the sum
    3.intilazie sum for calculating the total val of each row 
    4.storing the values of Max_sum;  
     * 
     */
    public static void main(String[] args){
    int[][] mat={{1,5},{7,3},{3,5}};
    int max_sum=0;
 
    for(int i=0;i<mat.length;i++){
    int sum=0;
    for(int j=0;j<mat[i].length;j++){
     sum+=mat[i][j];
    }
    max_sum=Math.max(sum,max_sum);
    }
    System.out.println("Maximum sum"+max_sum);
    }
}
