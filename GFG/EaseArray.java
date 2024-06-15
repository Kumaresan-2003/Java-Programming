import java.util.*;

public class EaseArray {
    public static void main(String[] args) {
      
      int arr[]={0, 2, 2, 2, 0, 6, 6, 0, 0, 8};
//Output :  4 2 12 8 0 0 0 0 0 0
      int n=10;
      for(int i=0;i<n-1;i++){
        if(arr[i]==arr[i+1]){
          arr[i]=2*arr[i];
          arr[i+1]=0;
        }
      }
      int k=0;
      for(int j:arr){
        if(j!=0){
          arr[k]=j;
          k++;
        }
      }
      
      while(k<n){
        arr[k]=0;
        k++;
      }
      for(int i:arr){
        System.out.print(i+" ");
      }
  }
}