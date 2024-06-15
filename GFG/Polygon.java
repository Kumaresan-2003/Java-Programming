import java.util.*;
public class Polygon{
       public static void main(String args[]){
              int n;
              int sumofangle;
              System.out.print("enter the value of side of polygon= ");
              Scanner sc =new Scanner(System.in);
              n = sc .nextInt();
              if(n>2){
                    System.out.println ("Sumofangles of polygon is"+(n-2)*180);
             }
             else{
                    System.out.println( "invalid input") ;
             }
      }
}