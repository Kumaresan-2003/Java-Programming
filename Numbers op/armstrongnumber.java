
public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int rem=0;
		int ct=0;
		int temp=n;
		int num=0;
		while(n!=0) {
			num=n%10;
			ct++;
			n=n/10;	
		}
		int sum=0; 
		System.out.println(ct);
		while(temp!=0) {
			rem=temp%10;
			sum+=Math.pow(rem, ct);
			temp=temp/10;
		}
		System.out.println(sum);

		

	}

}
