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
     * Main function to handle inputs and deliver outputs.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] tokens = scan.nextLine().split(" ");
        BinaryST<String, Integer> bst = new BinaryST<String, Integer>();
        for (int i = 0; i < tokens.length; i++) {
            bst.put(tokens[i], i);
        }
        while (scan.hasNext()) {
            String[] s = scan.nextLine().split(" ");
            switch (s[0]) {
            case "max":
                System.out.println(bst.getMax());
                break;
            case "floor":
                System.out.println(bst.getFloor(s[1]));
                break;
            case "rank":
                System.out.println(bst.getRank(s[1]));
                break;
            case "deleteMin":
                bst.deleteMin();
                break;
            case "contains":
                System.out.println(bst.contains(s[1]));
                break;
            case "keys":
                System.out.println(bst.toString());
                break;
            case "get":
                System.out.println(bst.get(s[1]));
                break;
            default:
                break;
            }
        }
    }
}
