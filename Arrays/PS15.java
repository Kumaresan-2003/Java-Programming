public class PS15 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=6;
        
        // // before the reversal
        // for(int i=0;i<n;i++){
        //      System.out.print("// before the reversal");
        //     System.out.print(arr[i]);
        // }

        for(int i=0;i<n;i++){
            arr[n-i-1]=arr[i];
            System.out.println(arr[i]);
        }
    //     // after the reversal
    //     for(int i=0;i<n;i++){
    //         System.out.println(arr[i]);
    //     }
    // 
}  
}
