public class SpecialWorddRev {
  // String perservation of reversal
  public static void main(String[] args) {
    String str = "internship at geeks for geeks";
    op1.oper(str);
  }
}

class op1 {
  static void oper(String str) {
    char[] inpuarr = str.toCharArray();
    char[] res = new char[inpuarr.length];
    for (int i = 0; i < inpuarr.length; i++) {
      if (inpuarr[i] == ' ') {
        res[i] = ' ';
      }
    }
    int j = res.length - 1, i = 0;
    for (i = 0; i < inpuarr.length; i++) {
      if (inpuarr[j] != ' ') {
        if (res[j] == ' ') {
          j--;
        }
      }
      res[j--] = inpuarr[i];
    }
    System.out.println(String.valueOf(res));
  }
}
