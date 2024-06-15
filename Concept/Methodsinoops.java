class Methodsinoops{
public static void main(String[] args){
//method call-1
int res=add();
int res=res*10;
system.out.println(res);
// method call-2
int a=345;
int b=10;
int res2=add2(a,b);
res2=res2*10;
system.out.println(res2);
}
//non-void&& non-paramters
public static int add(){
int a=10;
int b=15;
int c=a+b;
return c;
}
//non-void and parameterised
public static int add2(int a,int b){
int c=a+b;
return c; 
}