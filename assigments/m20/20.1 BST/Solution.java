import java.util.Scanner;
/**
 * solution.
 */
final class Solution {
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
        Scanner sc = new Scanner(System.in);
        BinarySearchTree b = new BinarySearchTree();
        while (sc.hasNextLine()) {
            String[] tokens = sc.nextLine().split(",");
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
            case "max":
                System.out.println(b.max());
                break;
            case "min":
                System.out.println(b.min());
                break;
            case "floor":
                System.out.println(b.floor(new Book(tokens[1],
                    tokens[2], Double.parseDouble(tokens[three]))));
                break;
            case "ceiling":
                System.out.println(b.ceiling(new Book(tokens[1],
                    tokens[2], Double.parseDouble(tokens[three]))));
                break;
            case "select":
                System.out.println(b.select(Integer.parseInt(tokens[1])));
                break;
            case "deleteMax":
                b.deleteMax();
                break;
            case "deleteMin":
                b.deleteMin();
                break;
            case "delete":
                b.delete(new Book(tokens[1],
                    tokens[2], Double.parseDouble(tokens[three])));
                break;
            default:
                break;
            }
        }
    }
}
