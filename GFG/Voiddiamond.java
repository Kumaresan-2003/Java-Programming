package kumaresan_HS_PS2;

import java.util.Scanner;

public class Voiddiamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = n - i - 1; j >= 0; j--) {
				System.out.print("* ");
			}
			for (int j = 0; j <= (2 * i +1); j++) {
				System.out.print("  ");
			}
			for (int j = n - i - 1; j >= 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j <=i; j++) 
			{
				System.out.print("* ");
			}
			for (int j =(2 * n - 2 * i - 2); j >=0 ; j--) 
			{
				System.out.print("  ");
			}
			for (int j =0; j<=i; j++)
			{
			System.out.print("*" +" ");
			}
			System.out.println();
		}

		}

	}

