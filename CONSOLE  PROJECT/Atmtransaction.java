import java.util.*;
//mini project 
public class Atmtransaction {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int bal=1000;
        int Withdraw=0;
        int deposit=0;
       while(true)
       {
        System.out.println("Welocomt to Atm transcation");
        System.out.println("Choose the option to procced");
        System.out.println("Enter the 1 to withdraw");
        System.out.println("Enter the 2 to Deposit");
        System.out.println("Enter the 3 to check balance");
        System.out.println("Enter the 4 to Exit");
        int option = sc.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter the amout to withdraw");
                Withdraw = sc.nextInt();
                if (Withdraw >= bal) 
                {
                    bal = bal - Withdraw;
                    System.out.println("Please collect the Money" + Withdraw);
                } else 
                {
                    System.out.println("Insufficient Balance");
                }
                break;
            case 2:
                 System.out.println("Enter the amout to Deposit:");
                 deposit=sc.nextInt();
                 bal+=deposit;
                 System.out.println("Your money is Deposited Successfully");
                 break;

            case 3:
                System.out.println("Your Account balance:"+bal);
                break;

            case 4:
                sc.close();
                System.exit(0);

            default:
              System.out.println("Invalid Option");

        }
        
       }
    }
}
