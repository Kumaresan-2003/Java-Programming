import java.util.*;
public class Problemsolving6 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int num;
        num=sc.nextInt();
        System.out.println("Enter the Digits");
        numberofdigits(num);
    }
    static void numberofdigits(num)
    {
        String number1=int.toString(num);
        System.out.println(number1.length());
    }
    
}
