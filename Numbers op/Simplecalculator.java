import  java.util.*;
 public class Problemsolving7 {
    public static void main(String agrs[])
    {
        Scanner sc =new Scanner(System.in);
        int num1, num2;
        char op;
        System.out.println("enter the Values");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.println("enter the Operator(+,-,*,/)");
        op =sc.next().charAt(0);
        solve(num1,num2,op);
    }
    static int solve( int num1, int num2, char op)
    {
        int ans=0;
        if(op=='+'){
            ans=num1+num2;
        }
        else if(op=='-'){
            ans=num1-num2;
        }
        else if(op=='*'){
            ans=num1*num2;
        }
        else if(op=='-'){
            ans=num1/num2;
        }
        return ans;
        System.out.println("your Answer:"+ ans);
    }
    
}
