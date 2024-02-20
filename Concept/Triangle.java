class Triangecheck
{
    int side1=10;
    int side2=20;
    int side3=30;
    int largenum=0;
    int otherside=0;
    void display()
    {
    if(side1>side2 && side1>side3){
         largenum=side1;
    }
    else if(side2>side1 && side2>side3)
    {
       largenum=side2;
    }
    else
    {
        largenum=side3;
    }
    if(side1!=largenum && side2!=largenum){
        otherside=side1+side2;
    }
    else if(side2!=largenum && side2!=largenum){
        otherside=side2+side3;
    }
    else{
        otherside=side1+side2;
    }
    System.out.println(largenum);
    System.out.println(otherside);
    }
    // new method
    void rigth(){
        if(Math.pow(largenum,2)==Math.pow(otherside,2)){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    /// new method 2
    void equilateral(){
        if(side1==side2 && side1==side3&& side2==side3){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    // new method
    void isoscseles(){
        if(side1!=side2 && side1!=side3 && side2!=side3){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }



}
class Triangle{
    public static void main(String [] args){
        Triangecheck obj =new Triangecheck();
        obj.display();
        obj.rigth();
        obj.isoscseles();
        


    }
}


