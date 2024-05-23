//n = 3
//arr[] = {1, 2, 3}
//Output: 
//1
public int peakElement(int[] arr,int n)
    {
       //add code here.
       if (n == 1) {
        return 0; // Return 0 for empty array or no peak for single element
        }
       for(int i=0;i<n;i++)
       {
           
           if(i==0 && arr[i]>=arr[i+1]){
               return 1;
           }
           else if(i==n-1 && arr[i]>=arr[i-1]){
               return 1;
           }
           else if(i!=0 && arr[i]>=arr[i-1] && arr[i]>=arr[i+1]){
              return 1;
           }
       }
       return 0;
     
    }