import java.util.*;
public class ps6 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			try {
				long x=sc.nextLong();
				if (x>Long.MAXVALUE|| x<Long.MINVALUE) {
					System.out.println(x+"can be fitted");
				}
			}else {
				System.out.println(x+"canbe fitted ");
				if(x>=-128 && x<=127) {
					System.out.println("*byte");
				}
				if(x>Short.MAXVALUE && Short.MINVALUE) {
					System.out.println("*short");
				}
				if(x>=Integer.MIN_VALUE && Integer.MAX_VALUE) {
					System.out.print("*Int");
				}
				if(x>=Long.MIN_VALUE &&Long.MAX_VALUE) {
					System.out.print("*Long");
				}
				catch(exception e)
				{
						System.out.print(sc.next()+" can't be fitted");
				}
				
			}
			scan.close();
		}
	}
}
