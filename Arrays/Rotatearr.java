package javaseries;
import java.util.*;
public class Rotatearr {
			public static void rotatearr(int arr[],int d, int n) {
				int[]temp=new int[d] ;
				//extracting the elements in temp arr
				for(int i=0;i<d;i++) {
					temp[i]=arr[i];
				}
			
				//shifting the values 
				for(int i=d;i<n;i++) {
					arr[i-d]=arr[i];
				}
				
				//addding the elements in original arrays
				int j=0;
				for (int i=n-d;i<n;i++){
					arr[i]=temp[j];
					j++;
				}
				for(int k=0;k<n;k++) {
					System.out.print(arr[k]+" ");
					}
	}
	public static void main(String[] args) {
		
//Scanner	sc=Scanner(System.in);
//		for (int i=0;i<n;i++) {
//			System.out.println("enter the value"+ rr[i]));
//			int[]arr=sc.nextInt();
//		}
		int[]arr=new int[] {1,2,3,4,5,6,7};
		int n =arr.length;
//		System.out.print(n);
		int d=3;
		Rotatearr obj =new Rotatearr();
		obj.rotatearr(arr,d,n);
   

	}

}
