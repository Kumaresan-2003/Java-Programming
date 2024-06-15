import java.util.*;
public class Pascal_triangle {
  public static void main(String[] args) {
   int n=5;
   int coef=1, sp,i,j;
   for(i=0;i<n;i++){
     for (sp=1;sp<=n-i;sp++)
     {
       System.out.print(" "); 
     }

     for(j=0;j<=i;j++){
       if(j==0 ||i==0){
         System.out.print(1+" ");
       }
       else{
         coef=coef*(i-j+1)/j;
         System.out.print(coef+" ");
       }
     }
     
     System.out.println();
   }
 }
}