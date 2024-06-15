public class GCD{
  //GCD Calculator IN TWO NUMBERS 
  public static void main(String[] args) {
    int a = 27, b = 13;
    int ans = a < b ? a : b;
    System.out.println(ans);
    for (int i = ans; i >= 1; i--) {
      if (a % i == 0 && b % i == 0) {
        System.out.println(i);
        break;
      }
    }
  }
}