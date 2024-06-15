public class Poweroftwo {
    // Power OF NUMBERS 
    public static void main(String[] args) {
        int N = 2;
        boolean flag = false;
        for (int i = 0; i < N; i++) {
            if ((int) Math.pow(2, i) == N) {
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.print("It is power");
        } else {
            System.out.print("It is Not  power");
        }

    }
}
