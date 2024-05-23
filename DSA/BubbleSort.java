public class BubbleSort {
    public static void main(String[] args) {
        int arr[]=new int[]{4,5,1,2,3,4,4};
        for(int i=0;i<arr.length-1;i++){
            boolean swap=false;
            for(int j=0;j<(arr.length-i-1);j++){         
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            
            }
            if(swap==false){
                break;
            }
        }
        // for(int i:arr)
        // {
        //     System.out.print(i +" ");
        // }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
