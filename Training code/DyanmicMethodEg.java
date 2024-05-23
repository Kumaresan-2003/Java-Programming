class A{
	int x=10;
}
class B extends A{
	
	int x=20;
	// upcasting 
	// Dyanmic method Dispactch
}

public class DyanmicMethodEg {
	

	public DyanmicMethodEg() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new B();
		System.out.print(a.x);

	}

}
