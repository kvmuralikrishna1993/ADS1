import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    Solution() {
    }
    /**
     * { function_main }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        //for (int i = 0; i < array.length; i++) {
        //  System.out.println(array[i]);
        //}
        final int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length - 2; i++) { //first element
            int l = i + 1; //second element
            int r = array.length - 1; //third element
            while (l < r) {
                if ((array[i] + array[l] + array[r]) == sum) {
                   count++;
                   l++;
                   r--;
                } else if ((array[i] + array[l] + array[r]) < 0) {
                    l++;    // moving forward (==> .....r)
                } else {
                    r--;   // moving backward (l.....<==)    // moving backward (l.....<==)
                }
            }
        }
        System.out.println(count);
    }
}
