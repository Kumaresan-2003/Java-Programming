class GFG {
  static void main(String[] args) {
    System.out.println("String reverse");
    String str = "Kumar", nstr = "";
    char ch;
    System.out.println("");
    System.out.println("");
    for (int i = 0; i < str.length(); i++) {
      ch = str.charAt(i);
      nstr = ch + nstr;
    }
    System.out.println("Reversed string" + nstr);
  }
}
