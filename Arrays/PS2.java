// Java Program to sort even-placed elements in increasing and 
// odd-placed in decreasing order with constant space complexity 
import java.util.*; 
public class PS2
{ 
    // Driver Code 
    public static void main (String[] args) 
    { 
        int arr[] = { 1, 5, 8, 9, 6, 7, 3, 4, 2, 0 }; 
        int n = arr.length; 
        op1.op2(arr, n); 
    } 
}
class op1
{
    static void op2(int arr[],int n)
{
    ArrayList<Integer>even=new ArrayList<Integer>();
    ArrayList<Integer>odd=new ArrayList<Integer>();
    for(int i=0;i<n;i++)
    {
        if(i==0 &&i%2==0){
           even.add(arr[i]);
        }
        else{
            odd.add(arr[i]);
        }
    }
    Collections.sort(even);
    Collections.sort(odd, Collections.reverseOrder());
    // for(int i:even){
    //     System.out.println(i +" ");
    // }
    // for(int i:odd){
    //     System.out.println(i +" ");
    // }
    int i = 0;
            for (int e : even) {
                arr[i++] = e;
            }
            for (int o : odd) {
                arr[i++] = o;
            }
            for (int j = 0; j < n; j++) {
                System.out.print(arr[j] + " ");
            }
}

}