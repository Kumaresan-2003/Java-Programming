import java.util.*;

public class Leftrotation {
    public static void main(String[] args) {
//       Original array: 
// 1 2 3 4 5 
// Array after left rotation: 
// 4 5 1 2 3
      int n=3;
      int [] arr={1,2,3,4,5};
      for (int i=0;i<n;i++)
      {
        int j,first;
        first=arr[0];
        for (j=0;j<arr.length-1;j++)
        {
          arr[j] = arr[j+1];
        }
        arr[j]=first;
      }
      
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
      
  }
}