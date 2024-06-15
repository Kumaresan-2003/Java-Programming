package javaseries;
import java.util.*;
class Arrayoperation{
public static void ins_end(int arr[],int n,int val){
	arr[n-1]=val;
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
public static void ins_pos(int arr[],int n,int val,int pos){
	if(pos>=0 && pos<n) {
		for(int i=n-1;i>pos;i--) {
			arr[i]=arr[i-1];
		}
		arr[pos]=val;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	else {
		System.out.print("invalid postion");
	}	
}
public static void ins_sortedarr(int arr[],int n,int key) {
	int pos=key-1;
	for(int i=pos;i<n;i++) {
		arr[i]=arr[i-1];
	}
	arr[pos]=key;
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
}
}
public class Operationsinarray {
	public static void main(String[] args) {
	int []arr={1,2,3,5,6,0,0};
	int n=arr.length;
	int key=4;
//	int pos=;
//	arraop.ins_end(arr,n,value);
//	arraop.ins_pos(arr, n, value,);
//	arraop.ins_sortedarr(arr, n, key);

	}

}
