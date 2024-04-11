import java.util.*;
class PS6
{
    // program to remove the Duplicate elemnts in array 
    public static void main(String [] args)  
{   
        //int N=10;
        int arr[]=new int[]{1,2,2,4,5,5,6,6,7,6};    
        // if(N>1)
        // {
        // System.out.println(N);
        // }
        Set<Integer>unique=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            unique.add(arr[i]);
        }
        System.out.println(unique.size());
        for(int i:unique){
            System.out.print(i +" ");
        }
}
}
