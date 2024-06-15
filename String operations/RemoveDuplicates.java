import java.util.*;
public class RemoveDuplicates {
  // Remoce the Duplicates through the Array
    public static void main(String args[]){
      int[] freq=new int[200];
      String st = "blockchain technology";
      char s[] = st.toCharArray();
      System.out.println(s);
      Arrays.sort(s);
       System.out.println(s);
      for (char c : s) {
            if (Character.isLetter(c)) {
                freq[c]++;
            }
        }
        
      for (char c : s) {
            if (Character.isLetter(c) && freq[c] == 1) {
                System.out.print(c + " ");
            }
        }
     
    }
}
//input:
//blockchain technology
//abccceghhikllnnoooty

//Op:
//a b e g i k t y
