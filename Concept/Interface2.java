interface In1 {
  
    // public, static and final
    final int a = 10;

    // public and abstract
    void display();
}

// A class that implements the interface.
public class Interface2 implements In1 {
  
    // Implementing the capabilities of
    // interface.
    public void display(){ 
      System.out.println("Geek"); 
    }

    // Driver Code
    public static void main(String[] args)
    {
        Interface2 t = new Interface2();
        t.display();
        System.out.println(a);
    }
}
