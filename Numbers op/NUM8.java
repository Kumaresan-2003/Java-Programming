public class NUM8 {
    public static void main(String[] args) {
        // printing the prime Numbers only
        int num = 13;
        int count = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("Number is prime:" + num);
        } else {
            System.out.println("Number is Not");
        }

    }
}
