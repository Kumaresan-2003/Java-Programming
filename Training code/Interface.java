
interface FirstInterface {
	public void mymethod1();
	public void myMethod();

	int id = 10;// interface method
}

interface SecondInterface {
	public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
	public void mymethod1(){
		System.out.println("This is Method1 ");
	}
	public void myMethod() {
		System.out.println("Some text..");
	}

	public void myOtherMethod() {
		System.out.println("Some other text...");
	}
}

public class Interface {
	public static void main(String[] args) {
		DemoClass myObj = new DemoClass();
		myObj.myMethod();
		myObj.myOtherMethod();
		myObj.mymethod1();
		System.out.print(myObj.id);
	}
}