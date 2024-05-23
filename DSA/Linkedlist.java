public class Linkedlist{
public static void main(String[] args){
int arr[]={2,5,4,8,9};
node y=new node(arr[0]);
System.out.println(y.data);
}
}

class node{
int data;    
node next;
node(int data1,node next1)
{
//constructor 1    
this.data=data1;
this.next=next1;
}
node(int data1)
{//constructor 2
this.data=data1;    
this.next=null;
}
};


