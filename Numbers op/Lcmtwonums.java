import java.util.*;
class lcm{
  public static int calculate(int n1,int n2){
    int max=n1>n2?n1:n2;
    System.out.println(max);
    while(true){
      if(max%n1 ==0 && max%n2==0){
        max++;
      }
    }
  }
}
public class calculateLCM {
    public static void main(String[] args) {
      System.out.println("Hello, World!");
      lcm.calculate(10,20);
  }
}