import java.util.*;

public class Removecharacter {
    public static void main(String[] args) {
      String s1="computer";
      String s2="cat";
      int[] arr=new int[26];
      for(int i=0;i<s2.length();i++){
        arr[s2.charAt(i)-'a']++;
      }
      String s=" ";
      for(int i=0;i<s1.length();i++){
        arr[s1.charAt(i)-'a']++;
        if(arr[s1.charAt(i)-'a']==1){
          s+=s1.charAt(i);
        }
      }
      System.out.print(s);
      
      
  }
}