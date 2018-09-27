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
        Scanner sc =  new Scanner(System.in);
        Percolation object = new Percolation(sc.nextInt());
        while (sc.hasNext()) {
            object.open(sc.nextInt(), sc.nextInt());
        }
        System.out.println(object.percolates());
    }
}
