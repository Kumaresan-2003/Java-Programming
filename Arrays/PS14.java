import java.util.*;
public class PS14{
    public static void main(String  args[] ){
     int[] arr={45,3,4,5,6,7,8,8,5,6,67,8};
     Arrays.sort(arr);
    solution.duplicate(arr);
    }
}
class solution{
static void duplicate(int arr[])
{
      int i,j,freq;
      for(i=0;i<arr.length;i++)
      {
        freq=1;
        for(j=i+1;j<arr.length;j++)
        {
            if(arr[j]==arr[i]){
                freq++;
            }
            else{
                break;
            }
        }
      i=j-1;
      if(freq>1)
      {
        System.out.println(arr[i] +"  "+freq);
      }  
      }
}
}
