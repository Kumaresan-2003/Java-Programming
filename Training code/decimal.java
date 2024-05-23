
public class decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int digit=0;
		String binary = " ";
		while(n!=0) {
			 binary+=(n%2);
			n=n/2;
		}
		System.out.println(binary);
		StringBuilder str=new StringBuilder(binary);
		str=str.reverse();
		str.toString();
		System.out.print(str);
		
		
       

	}

}
