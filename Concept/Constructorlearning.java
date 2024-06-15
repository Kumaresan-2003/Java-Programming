 package kumar;
import java.io.*;
public class constructor{
    	int len1;
		int bredth;
		int height;
	public constructor() {
		len1=12;
		bredth=10;
		height=12;
		// TODO Auto-generated constructor stub
	}
	double vol(){
		   return (bredth*len1*height);		
	}
	  

	public static void main(String[] args) {
		constructor  mybox1= new constructor();
         double volume; 
          volume = mybox1.vol();
         System.out.println("voleme is" + volume );
		// TODO Auto-generated method stub

	}

}
