
public class Staircase {
     // transition Point in the array 
	
	public static int ans(int[] arr) {
		int flag=0;
		int beg=0;
		int end=(arr.length-1);
		while(beg<end) {
			int mid=(beg+end)/2;
			if(arr[mid]==1 && arr[mid-1]==0) {
				break;
			}
			else if(arr[mid]==1) {
				flag=1;
				end=mid-1;
			}
			else {
				beg=mid+1;
			}
		}
		if(flag==0) {
			return -1;
		}
		return end;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {0,0,0,1,1,1};
		int answer=ans(arr);
		System.out.print(answer);
		
		
		

	}

}
