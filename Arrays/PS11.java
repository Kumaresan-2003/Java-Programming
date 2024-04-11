import java.util.Arrays;
public class PS11 {
	// MERGE ARRAY FORM 2 ARRAYS 
	public static void main(String[] args) {
		int arr[] = { 1, 2, 33, 4, 45, 10 };
		int arr2[] = { 2, 3, 4, 5, 5, 6, 67 };
		int merge[] = new int[arr.length + arr2.length];
		int pos = 0;
		for (int i : arr) {
			merge[pos++] = i;
		}
		for (int j : arr) {
			merge[pos++] = j;
		}
		Arrays.sort(merge);
		// logic for merge
		for (int k : merge) {
			System.out.print(k + " ");
		}
		
	    // intersection 
		for(int i=0;i<merge.length;i++){
			int count =0;
			for (int j=i+1;j<merge.length;j++){
				if(merge[i]==merge[j]) {
					count++;
				}
			}
			if(count==1) {
//				System.out.print(merge[i]+":"+count);
				System.out.println("Intersection of values:"+merge[i]);
			}
			else {
				continue;
			}
		}
		/// Union 
	}

}
