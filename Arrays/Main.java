import java.util.*;
public class Main {
    public static void main(String[] args) {
      String str="My name is Kumaresan";
    String words[]=str.split("\\s");
    for (String s1:words){
    System.out.println(s1);
    }
    String reverseWord="";  
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";
    }  
     System.out.print(reverseWord.trim());
  }
}