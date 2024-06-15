import java.util.*;
public class Hextodecimal {
//   Input : 67
// Output: 103

// Input : 512
// Output: 1298

// Input : 123
// Output: 291
  static int convert(String  hex)
  {
  String digit="0123456789ABCDEF";
    hex=hex.toUpperCase();
    int val=0;
    for (int i=0;i<hex.length();i++){
      char c=hex.charAt(i);
      int d=digit.indexOf(c);
      val=16*val+d;
    }
    return val;
  }
    public static void main(String[] args) {
      int n=0;
    String hex = "C9";
    String hex1 = "1A";
    String hex2 = "512";
    
    System.out.println ("Result of Conversion of Character:"+convert (hex));
    System.out.println ("Result of Conversion of Character:"+convert (hex1));
    System.out.println ("Result of Conversion of Character:"+convert (hex2));
    
  }
}