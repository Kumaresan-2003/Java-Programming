public class Primenumber {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5,5,6,13,17,4,39 ,47};  
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
           boolean isPrime = true;           
            // Check if the current element is a prime number
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break; // No need to check further
                }
            }
            // Print the prime number
            if (isPrime && arr[i] > 1) {
                System.out.println("Prime: " + arr[i]);
            }
        }
    }
}
