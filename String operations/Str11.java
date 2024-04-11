public class Str11 {
    public static void main(String args[]){
      int[] freq=new int[200];
      String st = "blockchain technology";
      char s[] = st.toCharArray();
      for (char c : s) {
            if (Character.isLetter(c)) {
                freq[c]++;
            }
        }
      
      for (char c : s) {
            if (Character.isLetter(c) && freq[c] == 1) {
                System.out.print(c + " ");
            }
        }
     
    }
}
