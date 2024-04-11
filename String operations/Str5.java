public class Str5 {
    // TRemoving the Unnessary
    public static void main(String[] args) {
        String acc = "45Kumaresan123";
        String Str = " ";
        int count = 0;
        int sum = 0;
        for (int i = 0; i < acc.length(); i++) {
            if (acc.charAt(i) >= '0' && acc.charAt(i) <= '9') {
                count++;
                sum += acc.charAt(i);
            } else {
                Str += acc.charAt(i);
                continue;
            }
        }
        System.out.println("count:" + count);
        System.out.println("Sum:" + sum);
        System.out.println("Str:" + Str);

    }
}
