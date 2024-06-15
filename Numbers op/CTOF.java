import java.util.Scanner;
// temparature converrsion
public class CTOF {

    public static void main(String[] Strings) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double f = sc.nextDouble();

        double  celsius =((f-32)/9)*5;
        System.out.println(f + " degree Fahrenheit is equal to " + celsius + " in Celsius");
        
        System.out.print("Input a degree in celsisus: ");
        double c = sc.nextDouble();
        
        double  fa =(9*c)/5 +32;
        System.out.println(fa);
      
      
    }
}