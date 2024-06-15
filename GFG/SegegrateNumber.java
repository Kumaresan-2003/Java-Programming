
public class SegegrateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,34,45,9,8,90,3};
		int l=0;
		int r=arr.length-1;
		
		while(l<=r) {
			boolean lr=(arr[l]%2==1);
			boolean rp=(arr[r]%2==0);
			if(lr&&rp) {
				int temp=arr[l];
				arr[l]=arr[r];
				arr[r]=temp;
				l++;
				r--;
			}
			else if(lr) {
				r--;
			}
			else {
				l++;
			}
		}
		System.out.print("the Array is ");
		for(int i: arr) {
			System.out.print(i+" ");
		}

	}
	}
