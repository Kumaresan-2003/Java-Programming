package javaseries;
import java.util.*;
class Countsquare {
	static int count=0;
	public static void printsquare(int n){
		for(int i=1;i<n;i++){
			if(i*i<n){
				count=count+1;
			}
			else {
				continue;
			}	
		}
		System.out.println("no of perfect squarers"+count);
	}
}
public class Countsquare {
	public static void main(String[] args) {
		System.out.println("Enter the value");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		noofsquares.printsquare(num);
	
	}
}
