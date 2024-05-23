
public class Stringsconsective {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="wwwwaaadexxxxxxywww";
		int n=s.length();
		int count=1;
		String ans=" ";
		for(int i=0;i<n;i++) {
			count=1;
			while(i<n-1&& s.charAt(i)==s.charAt(i+1)) {
				count++;
				i++;
			}
			System.out.print(s.charAt(i)+" "+count);
		}
		

	}

}
