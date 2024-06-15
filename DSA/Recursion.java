import java.util.*;
public class Recursion {
  public static void main(String[] args) {
    int res=nat(10);
    System.out.println(res);
    
  }
  public  static int nat(int n){
    if(n==1){
      return n;
    }
    else{
      System.out.println(n);
      return nat(n-1);
    }
  }
}