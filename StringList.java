import java.util.*;
///Mini Attendence App using java 
class StringList{
    public static void main(String args[] ){
    ArrayList <String> atted = new ArrayList<String>();
    String n;
    int count=0;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the -1 to exit ");
    do{
        System.out.print("Enter the Roll Number:");
        n=sc.nextLine();
        if(!n.equals("-1")){
             atted.add(n);
             count++;
        }
       
    }
    while(!n.equals("-1"));
    System.out.print(atted);
    System.out.print(count);
    }

//output :
// enter the -1 to exit 
// Enter the Roll Number:k 2k21it01
// Enter the Roll Number:2k21it32
// Enter the Roll Number:2k21it35
// Enter the Roll Number:2k21i55
// Enter the Roll Number:2k21it56
// Enter the Roll Number:2k21i31
// Enter the Roll Number:-1
// [2k21it01, 2k21it32, 2k21it35, 2k21i55, 2k21it56, 2k21i31]6
    
}