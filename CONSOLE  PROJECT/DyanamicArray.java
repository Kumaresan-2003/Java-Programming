import java.util.*;

class arralist {
    int[] arr;
    int initialcap = 16;
    int size = 0;
    int capacity = 16;

    public void expandarr() {
        arr = Arrays.copyOf(arr, capacity * 2);
        capacity *= 2;
    }

    public void add(int val) {
        if (size >= capacity) {
            expandarr();
        }
        arr[size] = val;
        size++;
    }

    public void display() {
        System.out.print("Elements in the list: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void insertatposition(int pos, int val) {
        if (size == capacity) {
            expandarr();
        }
        for (int i = size - 1; i >= pos; i--) {
            arr[i + 1] = arr[i];
        }
        arr[pos] = val;
        size++;
    }

    public void deleteatposition(int pos) {
        for (int i = pos + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
    }
}

public class DynamicArray {
    public static void main(String[] args) {
        arralist list = new arralist();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add element");
            System.out.println("2. Display elements");
            System.out.println("3. Insert at position");
            System.out.println("4. Delete at position");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the value to add:");
                    int val = sc.nextInt();
                    list.add(val);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    System.out.println("Enter the position to insert:");
                    int pos = sc.nextInt();
                    if (pos < 0 || pos > list.size) {
                        System.out.println("Invalid position");
                        break;
                    }
                    System.out.println("Enter the data:");
                    int val2 = sc.nextInt();
                    list.insertatposition(pos, val2);
                    break;
                case 4:
                    System.out.println("Enter the position to delete:");
                    int delPos = sc.nextInt();
                    if (delPos < 0 || delPos >= list.size) {
                        System.out.println("Invalid position");
                        break;
                    }
                    list.deleteatposition(delPos);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }
}