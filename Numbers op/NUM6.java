import java.util.Scanner;
public class NUM6 {
    // program to find the minimum number of Handshake
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int persons = sc.nextInt();
        int Handshakes = (persons * (persons - 1)) / 2;
        System.out.println(Handshakes);
        sc.close();

    }
}
