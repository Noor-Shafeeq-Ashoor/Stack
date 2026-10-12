
import java.util.Arrays;

public class EX1 {

    public static void rotate(int[] arr, int d, int n) {

        if (n == 0) {
            System.out.println("is Empty" );
            return  ;
        }

        d = d % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[i] = arr[(i + d) % n];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        int d = 3;
        int n = arr.length;

        rotate(arr, d, n);

        System.out.println(Arrays.toString(arr));
    }
}
