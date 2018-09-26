import java.util.Scanner;
import java.util.Arrays;
public class Solution {
    Solution() {
    }
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
                }
                l++; // moving forward (==> .....r)
                r--; // moving backward (l.....<==)
            }
        }
        System.out.println(count);
    }

}