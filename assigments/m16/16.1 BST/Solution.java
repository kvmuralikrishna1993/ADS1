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
        final int three = 3;
        final int four = 4;
        Scanner scan = new Scanner(System.in);
        BinarySearchTree b = new BinarySearchTree();
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(",");
            switch (tokens[0]) {
            case "put":
                b.put(new Book(tokens[1], tokens[2],
                 Double.parseDouble(tokens[three])),
                  Integer.parseInt(tokens[four]));
                break;
            case "get":
                System.out.println(b.get(new Book(tokens[1],
                 tokens[2], Double.parseDouble(tokens[three]))));
                break;
            default:
                break;
            }
        }
    }
}
