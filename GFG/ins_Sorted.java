package javaseries;

public class ins_Sorted {
    static int ins_1(int arr[], int n,int key,int capacity){
    	if(n>=capacity) {
    		return n;
    	}
    	int i;
    	for(i=n-1;(i>=0 && arr[i]> key);i++) {
    		arr[i+1]=arr[i];
    	}
    	arr[i+1]=key;
    	return (n+1);
    	
    }
	public static void main(String[] args) {
		int []arr={10,20,30,50,60,70};
		int capacity=arr.length;
		int n=6;
		int key=26;
		System.out.print("\nBefore Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
        
	    // function call
//        int m.ins_1(arr,n,key,capacity);
        int m = ins_1(arr, n, key, capacity);
         
        System.out.print("\nAfter Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
	}

}
