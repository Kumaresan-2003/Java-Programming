abstract class Square{
    int a=10;
	abstract void Area(); 
	abstract void print();
}
class rectangle extends Square{
	
	void print() {
		System.out.print("this is Rectangle ");
	}
}

public class AbstarctClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle   s=new rectangle() ;
		s.print();
		System.out.print(s.a);
	    
		

	}

}
