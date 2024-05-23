import java.util.*;
public class DistinctChar {
   public static void main(String[] args) {
      System.out.println(distinct.distinct1("kumaresanaaa"));

   }
}

class distinct {
   // 1.using the treeset
   // 2.It allows users to add unique characters in Data structures
   static TreeSet<Character> distinct1(String str) {
      TreeSet<Character> hs = new TreeSet<Character>();

      for (int i = 0; i < str.length(); i++) {
         hs.add(str.charAt(i));
      }
      // Collections.sort(hs);
      // printing the compnents
      // for(char ch:hs)
      // {
      // System.out.print(ch +" ");
      // }
      // return hs.size();
      return hs;
   }
}
