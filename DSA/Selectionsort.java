// simple implemntation of Sorting Algorithms
public class Selectionsort {
    public static void main(String[] args) {
        int arr[]=new int[]{2,3,4,5,6,7,8,1,0,45,67,89,99,10101,220};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

