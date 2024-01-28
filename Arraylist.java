import java.util.*;
// implemetation of Arraylist
class ArrayListExample {
    public static void main(String args[]) {
        ArrayList<Integer> atted = new ArrayList<Integer>();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter -1 to exit");
        do {
            System.out.println("Enter the Roll number:");
            n = sc.nextInt();
            if (n != -1) {
                atted.add(n);
            }
        } while (n != -1);

        System.out.println("ArrayList elements: " + atted);
    }
}
