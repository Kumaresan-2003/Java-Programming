package javaseries;
import java.io.*;
class SubSequences{
	public static void Pri(String str) {
		int n=str.length();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=i;k<j;k++) {
					System.out.print(str.charAt(k));
				}
				System.out.println();
			}
		}
		
	}
	
}
public class ProblemSolvingSubstrings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Kumaresan";
		SubSequences.Pri(str);
	}

}
