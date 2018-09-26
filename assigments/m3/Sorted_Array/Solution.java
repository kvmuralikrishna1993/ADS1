import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * { function_main }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int[] array = new int[s1 + s2];
        sc.nextLine();
        String[] a1 = new String[s1];
        if (s1 > 0) {
            a1 = sc.nextLine().split(",");
        } else {
            sc.nextLine();
        }
        String[] a2 = sc.nextLine().split(",");
        for (int i = 0; i < array.length; i++) {
            if (i < s1) {
                array[i] = Integer.parseInt(a1[i]);
            } else {
                array[i] = Integer.parseInt(a2[i - s1]);
            }
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                int temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
                i = 0;
            }
        }
            String str = "";
        for (int i = 0; i < array.length; i++) {
            str += Integer.toString(array[i]);
            if (i != array.length - 1) {
                str += ",";
            }
        } System.out.println(str);
    }
}
