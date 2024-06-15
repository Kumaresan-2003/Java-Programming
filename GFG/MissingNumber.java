import java.util.*;
public class ps3{
    public static void main(String args[]){
        int [] arr= {1,2,3,5};
        int N;
        int sum_n=0;
        int sum_arr=0;
        int missing;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of N ");
        N =sc .nextInt();
        sum_n=N*(N+1)/2;
        System.out.println(" sumof n "+sum_n);
        
        for (int i=0;i<arr.length;i++){
            sum_arr+=arr[i];
        }
        System.out.println(" sumof arr "+sum_arr);
        missing= sum_n-sum_arr;
        System.out.print("missing number is "+ missing);
    }
}