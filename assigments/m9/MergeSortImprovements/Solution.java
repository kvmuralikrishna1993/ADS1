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
        Merge mim = new Merge();
        while (sc.hasNextLine()) {
            String[] tokens = sc.nextLine().split(",");
            mim.sort(tokens);
            toString(tokens);
            System.out.println();
        }
    }
    /**
     * Returns a string representation of the object.
     *
     * @param      args  The arguments
     */
    public static void toString(final String[] args) {
        String str = "[";
        for (int i = 0; i < args.length; i++) {
            str += args[i];
            if (i != args.length - 1) {
                str += ", ";
            }
        }
        str += "]";
        System.out.println(str);
    }
}
