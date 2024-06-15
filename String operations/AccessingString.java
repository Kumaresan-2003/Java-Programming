class AccessingString {
    public static void main(String[] args) {
        String s = "kumar";
        // Accesing the  characters in String.
        for (int i = 0; i < s.length(); i++) {
            int A = 0;
            A = s.charAt(i);
            System.out.println(A);
        }
    }
}