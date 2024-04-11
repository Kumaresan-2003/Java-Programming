class NUM4 {
    //Fraction adder in numbers 2.
    public static void main(String[] args) {
        int n1 = 1, n2 = 3, d1 = 3, d2 = 9;
        int dem = 0;
        int num = 0;
        if (d1 == d2) {
            dem = d1;
            num = n1 + n2;
        } else {
            num = n1 * d2 + n2 * d1;
            dem = d1 * d2;
        }
        if (num > dem) {
            int max = dem;
            for (int i = max; i > 1; i--) {
                if (num % i == 0 && dem % i == 0) {
                    num = num / i;
                    dem = dem / i;
                } else {
                    continue;
                }
            }
        } else {
            int max = num;
            for (int i = max; i > 1; i--) {
                if (num % i == 0 && dem % i == 0) {
                    num = num / i;
                    dem = dem / i;
                }
            }

        }
        System.out.println(num + "/" + dem);
    }
}