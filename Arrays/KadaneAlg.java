public class KadaneAlg {
    public static void main(String[] args) {
        // Max subarray is Contigous
        int max_so = 0;
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int i = 0;
        while (i < arr.length - 1) {
            if(arr[i]<0){
                i++;
                continue;
            }
            max_so = +arr[i];
            if (max_so > 0) {
                i++;
            }
            if (max_so < 0) {
                max_so = 0;
                i++;
            }

        }
        System.out.println("Sum: " + max_so);

    }
}
