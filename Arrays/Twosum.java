public class Twosum {
    //Zoho company Question 1
    public static void main(String[] args) {
        int N=4;
        int K=6;
        int count =0;
        int arr[]={1,5,7,1};
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(arr[i]+arr[j]==K){
                    count++;
                }
                else{
                    continue;
                }
            }
        }
        System.out.print(count);
    }
}
