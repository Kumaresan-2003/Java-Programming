public class SetBitPositions {
    public static void main(String[] args) {
        int number = 42; // Example number
        int mask4 = 1 << 3; // Creating a mask to set the 4th bit
        int mask7 = 1 << 6; // Creating a mask to set the 7th bit

        int result = number | mask4 | mask7; // Setting the 4th and 7th bits to 1

        System.out.println("Original number: " + number);
        System.out.println("Number after setting 4th and 7th bits: " + result);
    }
}