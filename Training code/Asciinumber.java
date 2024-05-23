
public class Asciinumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abb";
		int[] arr=new int[26];
		int  index=0;
		
		for(int i=0;i<s.length();i++) {
			index=s.charAt(i)-'a';
			arr[index]++;
		}
		for(int i=0;i<s.length();i++) {
			System.out.print(arr[i]+" ");
		}
		int k=0;
		for(int i=0;i<s.length();i++) {
			if(arr[k]!=k+1) {
				System.out.print(false);
				break;
			}
			
		}
		System.out.print(true);

	}

}
