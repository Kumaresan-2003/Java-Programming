package javaseries;
import java.util.*;
public class Leftrotate {
		public static void fun(int arr[]) {
			int n=arr.length;
			int temp=arr[0];
			for(int i=0;i<n-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[n-1]=temp;
			for (int j=0;j<n;j++) {
				System.out.println(arr[j]);
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,4,3,2,1};
		Leftrotate obj =new Leftrotate();
		obj.fun(arr);
	}
}
