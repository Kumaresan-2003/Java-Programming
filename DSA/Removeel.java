class removalel{
	 static int[] rec(int[] arr,int n,int key){
	 	int indextoremove=-1;
	 	for(int i=0;i<n;i++){
	 		if(arr[i]==key){
	 			indextoremove=i;
	 			break;
	 		}
	 	}
	 	int[] newarr=new int[n-1];
	 	for(int i=0;i<n;i++){
			 int index=0;
	 		if(i!=indextoremove){
	 			arr[i]=newarr[index++];
	 		}
	 	}
	 	return newarr;
	 }
	 public static void main(String[] args) {
      int arr[]={2,33,5,67,8,8,5,5,6,7};
      int key=8;
      int n=10;
	  int[] result = rec(arr, n, key);
	  for(int i=0;i<result.length;i++){
		System.out.print(result[i] + " ");
	  }
	}
}