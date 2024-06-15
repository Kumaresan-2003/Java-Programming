package kumar;
import java.util.*;
import java.io.*;
public class  ReserveArray{
	static void main1(int arr[],int n) {
		for (int i=n-1;i>=0;i-- ) {
			System.out.print(arr[i] +"");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int arr[]= { 5,4,3,2,1};
		main1(arr,n);

	}

}
