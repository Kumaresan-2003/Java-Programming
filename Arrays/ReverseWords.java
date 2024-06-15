import java.util.*;
public class ReverseWords{
    public static void main(String[] args) {

    String str="My name is Kumaresan";
    String words[]=str.split("\\s");
    System.out.println(str);

    String reverseWord="";  
    
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";
    } 

     System.out.print(reverseWord.trim());
  }
}