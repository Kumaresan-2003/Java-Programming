public class Replace01 {
    // Program to Replace the '0' all value in integer to 1;
    public static void main(String[] args) {
        int i = 100202301;
        String str2 = " ";
        String str = Integer.toString(i);
        for (int a = 0; a < str.length(); a++) {
            if (str.charAt(a) == '0') {
                str2 = str2 + '1';
            } else {
                str2 = str2 + str.charAt(a);
            }
        }
        System.out.print(str2);

    }
}
