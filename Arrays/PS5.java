public class PS5 {
    // program the returns duplicate elements 
    public static void main(String[] args) {
        int n = 5;
        int arr[] =new int[] {2, 2, 2, 2, 2};
        int k=0;
        int temp[]=new int [n];
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count ++;
                }
            }
            if(count==1){
                temp[k++]=arr[i];
            }
        }
        System.out.println(k);
    }
}
