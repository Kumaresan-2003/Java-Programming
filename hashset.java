import java.util.*;
public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs =new HashSet<Integer>();
        Scanner sc=new Scanner(System.in);
        int n;
        do{ 
          System.out.println("enter the value:");
          hs.add(n=sc.nextInt());
        }
        while(n!=-1);
        System.out.println(hs);


    }
   


    
}
