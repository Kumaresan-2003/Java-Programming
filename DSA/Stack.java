public class Stack
 {
    public static void main(String[] args) {
   // adding nthe new elemnts 

        stack1.push(10);
        stack1.push(11);
        stack1.push(26);
        stack1.push(8);
       // Removing the last element 
       System.out.println(" Removing the last element ");
        System.out.println(stack1.pop());
    } 
}
class stack1
{  static int ministack[]= new int[10];
   static int tos=-1;
    static void push(int item)
    {
         if(tos>ministack.length-1){
           System.out.println("-1");
         }
         else{
            ministack[++tos]=item;
         }
    }
    static int pop()
    {
          if(tos>=0){
            return ministack[tos--];
          }
          else{
            return 0;
          }
    }
}
