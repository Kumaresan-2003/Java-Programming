import java.util.*;
class Equilibruim {
  public static int findeq(int arr[], int n)
  {
    int leftsum,rightsum;
    for(int i=0;i<n;i++){
      leftsum=0;
      for(int j=0;j<i;j++){
        leftsum+=arr[j];
      }
      rightsum=0;
      for(int j=i+1;j<n;j++){
        rightsum+=arr[j];
      }
      if(leftsum==rightsum){
        return i;
      }
    } 
    return -1;
  }
  public static void main(String args[]){
    int arr[]={2,3,-1,8,4};
    int n= arr.length;
    int equili=findeq(arr,n);
    System.out.println(equili);
  }
}
