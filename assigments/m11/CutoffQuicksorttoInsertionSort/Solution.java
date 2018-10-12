import java.util.Scanner;
/**
 * { Solution class}.
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
        String count = sc.nextLine();
        Quick q = new Quick();
        for (int i = 0; i < Integer.parseInt(count); i++) {
            String cutoff = sc.nextLine();
            String[] tokens = sc.nextLine().split(" ");
            if (tokens[0].equals("")) {
                System.out.println("[]");
            } else {
                q.sort(tokens, Integer.parseInt(cutoff));
            }
        }
    }
}
