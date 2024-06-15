
public class Permutaions {
	static int fact(int n) {
		int ans=1;
		for(int i=1;i<n;i++) {
			 ans =ans*i;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="aaaaa";
		int[] arr=new int[26];
		for(int i=0;i<s.length();i++) {
			arr[s.charAt(i)-'a']++;
		}
	
	    int ans=fact(s.length());
	    for(int i=0;i<26;i++) {
	    	if(arr[i]>1) {
	    		ans=ans/fact(arr[i]);
	    	}
	    }
	    System.out.print("Permutaions count is"+ans);
	
		

	}

}
