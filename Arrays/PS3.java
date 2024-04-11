public class PS3 {
    public static void main(String[] args) {
        int []arr=new int[]{1,2,3,4,5,6,7,8};
        int n= arr.length;
        sol.countnumber(arr,n);
    }
    
}
class sol{
    //Program  that returns the unique elemnets and count of it 
    static void countnumber(int[]arr,int n)
    {
      int k=0;
      int temp[]=new int[n];
      int count;
      for(int i=0;i<n;i++){
         count=0;
        for(int j=0;j<=i;j++){ 
             if(arr[i]==arr[j]){
                count++;
             }
        }
        if(count==1){
           temp[k]=arr[i];
           k++;
           
        } 
      }
      for(int i=0;i<k;i++){
         count=0;
        for(int f=0;f<n;f++){
            if(temp[i]==arr[f]){
                count++;
            }
        }
        System.out.println(temp[i]+" "+count);
      }

    }
}

    



// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 5, 6, 7, 7, 8, 1, 1, 2};
//         int n = arr.length;
//         int k = 0;
//         int[] temp = new int[n];
//         int count = 0;

//         for (int i = 0; i < n; i++) {
//             count = 0;
//             for (int j = 0; j <= i; j++) {
//                 if (arr[i] == arr[j]) {
//                     count++;
//                 }
//             }
//             if (count == 1) {
//                 temp[k] = arr[i];
//                 k++;
//             }
//         }

//         for (int i = 0; i < k; i++) {
//             count = 0;
//             for (int f = 0; f < n; f++) {
//                 if (temp[i] == arr[f]) {
//                     count++;
//                 }
//             }
//             if (temp[i] != 0) {
//                 System.out.println(temp[i] + " " + count);
//             }
//         }
//     }
// }
