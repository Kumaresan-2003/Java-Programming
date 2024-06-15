import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
// warmup Solutio
class ApplesOrange {
    public static void main(String[] args){
        int noofapple=0;
        int nooforange=0;
        Scanner sc =new Scanner(System.in);
        int s =sc.nextInt();
        int t=sc.nextInt();
        int a =sc.nextInt();
        int b=sc.nextInt();
        int m =sc.nextInt();
        int n=sc.nextInt();
        int [] apple=new int [m];
        int [] orange=new int [n];
        for(int i=0;i<m;i++){
            apple[i]=sc.nextInt() +a;
        }
        for(int i=0;i<m;i++){
            apple[i]=+a;
        }
        for(int i=0;i<n;i++){
            orange[i]=sc.nextInt() +b;
        }
        for(int i=0;i<n;i++){
            orange[i]=+b;
        }
        
        for(int app:apple){
            if(app<=s && app>=t){
                noofapple+=1;
            }
        }
        for(int org:orange){
            if(org<=s && org>=t){
                nooforange+=1;
            }
        }
        System.out.println(noofapple);
        System.out.println(nooforange); 
    }
}
