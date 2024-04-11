public class PS9 {
    // LONGEST PREFIX STRING 
static String commonPrefix(String str1,String str2)
{
   String result=" ";
   int n1=str1.length();
   int n2=str2.length();
        for(int i=0, j=0; i<n1-1 && j<=n2-1;i++,j++)
        {
            if(str1.charAt(i)!=str2.charAt(j))
            {
                break;
            }
            result+=str1.charAt(i);
        }
        return result;
}
    public static void main(String args[]){
    String str1="Helllo";
    String str2="Hello";
    String res=commonPrefix(str1, str2);
    System.out.println(res);
    }
}
