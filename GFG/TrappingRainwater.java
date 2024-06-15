import java.util.*;
import java.lang.*;
public class TrappingRainwater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] height= { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
		int lMax=height[0];
		Stack<Integer> rmax=new Stack<>();
		
		// rightmax 
		rmax.push(height.length-1);
		
		for(int i=height.length-2;i>=1;i--) {
			int temp=Math.max(rmax.peek(),height[i]);
			rmax.push(temp);
		}
		
		int toWater=0;
		for(int i=1;i<height.length-1;i++) {
			
			int minimum=Math.min(rmax.peek(),lMax);
			int temp=minimum-height[i];
			toWater=Math.max(0, temp);
			rmax.pop();
			lMax=Math.max(lMax,height[i]);
			
		}
		System.out.print("MAximum Cap"+toWater);
		
		

	}

}
