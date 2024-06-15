
public class Wagoncount {

	public static void main(String[] args) {
		// TODO Auto-generated method 
         int V=200;
         int W=540;
         int x=0,y=0;
         if(W<2||W%2!=0) {
        	 System.out.print("Invalid Input");
         }
         else {
        	 x=(4*V-W)/2;
        	 y=(V-x);
        	 System.out.println("No of Bikes are"+x);
        	 System.out.println("No of Car are"+y);
         }

	}

}
