public class Isogram{
Static boolean isIsogram(String data){
    data=data.toLowerCase();
        int len=data.length();
        char[] arr= data.toCharArray();
        for(int i=0;i<len-1;i++){
            if(arr[i]==arr[i+1]){
                return false;
            }
        }
        return true;
} 

public static void main(String[] args) {
String str="Kumar";
boolean res=isIsogram(str);
System.out.print("The res"+res);
}
}
