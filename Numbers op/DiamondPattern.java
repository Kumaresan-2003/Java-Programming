import java.util.*;

public class DiamondPattern {
    public static void main(String[] args) {
//    * 
//   * * 
//   * * * 
// * * * * 
// * * * * * 
// * * * * * 
// * * * * 
//   * * * 
//   * * 
//    * 
      int n=10;
      for(int i=0;i<n;i++){
        for(int sp=n-i-1;sp>0;sp--){
          System.out.print(" ");
      }
      for(int j=0;j<=i;j++){
         System.out.print("* ");
      }
      System.out.println();
  }
  for(int i=0;i<n;i++){
    for(int j=0;j<i;j++){
      System.out.print(" ");
    }
    for(int st=n-i-1;st>=0;st--){
          System.out.print("* ");
      }
      System.out.println();
  }
}
}