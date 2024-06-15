public class Replace{
    public static void main(String[] args) {
        String str = "Hello World 0 0 0";
        String newStr = str.replace("0", "5");
        System.out.println("Original String: " + str);
        System.out.println("New String: " + newStr);
    }
}