class NUM2 {
    // coverting the decimal to binary number
    public static void main(String[] args) {
        int n = 7;
        int i = 0;
        int[] rem = new int[1000];
        while (n > 0) {
            rem[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(rem[j]);
        }

    }

}