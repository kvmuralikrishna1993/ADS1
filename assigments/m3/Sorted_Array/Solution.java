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
        int[] array = new int[s1+s2];
        sc.nextLine();
        String[] a1 = sc.nextLine().split(",");
        String[] a2 = sc.nextLine().split(",");
        for (int i = 0; i < array.length; i++) {
            if(i < a1.length) {
                array[i] = Integer.parseInt(a1[i]);
            } else {
                array[i] = Integer.parseInt(a2[i - a1.length]);
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
