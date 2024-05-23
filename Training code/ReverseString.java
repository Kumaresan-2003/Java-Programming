
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str="Kumar";
        char[] temporay=Str.toCharArray();
		int n=temporay.length-1;
		int j=n;
		char temp;
		for(int i=0;i<n/2;i++) {
			temp=temporay[i];
			temporay[i]=temporay[j];
			temporay[j]=temp;
			j--;
		}
		for(char c:temporay) {
			System.out.print(c+" ");
		}
		
		

	}

}
