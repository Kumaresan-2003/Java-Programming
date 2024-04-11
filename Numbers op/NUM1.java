public class NUM1 {
    public static void main(String[] args) {
        System.out.println(solution.qwe("110", "011"));
    }
}
class solution {
    static String qwe(String x, String y) {
        int i = x.length() - 1;
        int j = y.length() - 1;
        StringBuilder res = new StringBuilder();
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += x.charAt(i) - '0';
            }
            if (j >= 0) {
                sum += y.charAt(j) - '0';
            }
            if (sum == 0 || sum == 1) {
                res.append(sum);
                carry = 0;
            } else if (sum == 2) {
                res.append(sum);
                carry = 1;
            } else {
                res.append("1");
                carry = 1;
            }
            i--;
            j--;
            if (carry == 1) {
                res.append("1");
            }
            sum--;
        }
        return res.reverse().toString();
    }
}
