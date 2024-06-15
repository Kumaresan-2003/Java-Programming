public class ArrayEvaluation {
    // Zoho question -2
    public static void main(String[] args){
       int arr[]={1,2,3,1,5,2,5};
        int i=0;
        for(i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i] && arr[i+1]>arr[i]){
                System.out.print(arr[i]+":"+i+" ");
            }
        }
    }
}
