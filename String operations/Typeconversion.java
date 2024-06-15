public class Typeconversion {
    public static void main(String[] args) {
        // type conversion in java
        // 1.Boolean to string
        Boolean val = true;
        String op = Boolean.toString(val);
        System.out.println(op);

        // 2.Double to string
        Double val2 = 10.00;
        String op2 = Double.toString(val2);
        System.out.println(op2);

        // string to Double
        String mat2 = "100";
        Double op3 = Double.valueOf(mat2);
        System.out.println(op3);
    }
}
