// working Lambda expression
// import java.util.*;
interface A{
    void show();
}
class Lambda{
    public static void main(String[] args){
        A obj;
        obj =()-> System.out.print("hello");
        obj.show();
    }
}