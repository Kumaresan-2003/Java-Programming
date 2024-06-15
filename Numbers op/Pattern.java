public class Pattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n=5;
         int k=0;
         for(int i=n-1;i>=0;i--) {
        	 for(int j=0;j<=i;j++) {
        		 if(i==0 ||i==n-1||j==0||j==n-1||i==j) {
        			 System.out.print("* ");
        		 }
        		 else{
        			 System.out.print("  ");
        		 }
        	 }
        	 System.out.println();
         }
}
}
