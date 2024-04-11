import java.util.*;
public class Pattern_1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the value of n");
		int n=sc.nextInt();
//		patterns.star_1(n);
//		patterns.star_2(n);
//		patterns.num_1(n);
//		patterns.num_2(n);
//		patterns.star_3(n);
//		patterns.num_3(n);
//		patterns.num_4(n);
//    	patterns.num_5(n);
//		patterns.num_6(n);
//		patterns.star_5(n);
//		patterns.char_1(n);
		patterns.char_2(n);
	}
}

class patterns{
	public static void star_1(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	public static void star_2(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
	public static void num_1(int n) {
//		1
//		22
//		333
//		4444
//		55555
//		666666
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(num);
			}
			System.out.print("\n");
			num++;
		}
	}
	public static void num_2(int n) {
//		1
//		12
//		123
//		1234
//		12345
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
	public static void star_3(int n) {
//		*****
//		****
//		***
//		**
//		*
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
public static void num_3(int n) {
//	12345
//	1234
//	123
//	12
//	1
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(j);
			}
			System.out.print("\n");
		}
	}
public static void num_4(int n) {
//    *    
//   ***   
//  *****  
// ******* 
//*********
	
          for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=(2*i)+1;k++) {
				System.out.print("*");
			}
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
public static void num_5(int n) {
//	*********
//	 ******* 
//	  *****  
//	   ***   
//	    * 
        for(int i=0;i<n;i++){
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*n-(2*i+1);k++) {
				System.out.print("*");
			}
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
public static void num_6(int n) {
//    *    
//   ***   
//  *****  
// ******* 
//*********
//*********
// ******* 
//  *****  
//   ***   
//    *  
for(int i=0;i<n;i++){
	for(int j=0;j<n-i-1;j++) {
		System.out.print(" ");
	}
	for(int k=0;k<(2*i)+1;k++) {
		System.out.print("*");
	}
	for(int j=0;j<n-i-1;j++) {
		System.out.print(" ");
	}
	System.out.print("\n");
}
for(int i=0;i<n;i++){
	for(int j=0;j<i;j++) {
		System.out.print(" ");
	}
	for(int k=0;k<2*n-(2*i+1);k++) {
		System.out.print("*");
	}
	for(int j=0;j<i;j++) {
		System.out.print(" ");
	}
	System.out.print("\n");
}
}
public static void star_5(int n) {
//	*
//	**
//	***
//	****
//	*****
//	*****
//	****
//	***
//	**
//	*
	for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<=n-i-1;j++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}
}
public static void char_1(int n) {
//	AB
//	ABC
//	ABCD
//	ABCDE
//	ABCDEF
	for(int i=1;i<n;i++) {
		for(char ch='A';ch<='A'+i;ch++) {
			System.out.print(ch);
		}
		System.out.print("\n");
	}
}
public static void char_2(int n) {
	for(int i=1;i<n;i++) {
		for(int j=1;j<i;j++) {
			char ch='A';
			System.out.print(ch);
			ch++;
	}
		System.out.print("\n");
	}
}
}
