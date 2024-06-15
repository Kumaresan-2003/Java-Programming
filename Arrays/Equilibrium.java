public class Equilibrium{
    public static void main(String[] args) {
        int arr[]={1,3,5,2,2};
        int n=5;
        int var1=position.find(arr,n);
        System.out.println(var1);

    }
}
class position
{
     static int find(int arr[],int n)
    {    
        int leftsum=0;
        int rightsum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                leftsum+=arr[i];
            }
            for(int k=i+1;k<n;k++){
                rightsum+=arr[i];
            }
             if(leftsum==rightsum){
                return i;
             }
        }
        return -1;
    }
        
}
        
