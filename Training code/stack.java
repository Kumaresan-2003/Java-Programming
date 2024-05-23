class stack{
    int arr[]=new int[10];
     int head;
    stack(){
        head=-1;
    }
    public  void push(int n){
// inserion at last postion 
        if(head<arr.length){
            arr[++head]=n;
        }else{
            System.out.println("No space");
        }
    }

    public int peek(){
//last position at last

        if(head<arr.length){
            return arr[head];
        }else{
            System.out.print("No element-");
            return 0;
        }
    }
    public int pop(){
// deletion at last 
        if(head>-1){
            return arr[head--];
        }else{
            System.out.print("No element-");
            return 0;
        }
    }
    public static void main (String args[]){
        stack s=new stack();
        s.push(5);
        s.push(10);
        s.pop();
        s.pop();
        System.out.println("head-"+s.head);


    }

}