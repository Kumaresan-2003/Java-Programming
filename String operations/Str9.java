public class Str9 {
    // To find the value of Vowel or Const
    public static void main(String[] args) {
        String str = "Kumaresan";
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                case 'A':
                case 'E':
                case 'e':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'U':
                case 'u':
                    System.out.println("vowel:" + str.charAt(i));
                    break;
                default:
                    System.out.println("Const:" + str.charAt(i));
                    break;
            }
        }
    }
}
