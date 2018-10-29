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
   * Main function.
   *
   * @param      args  The arguments
   */
  public static void main(final String[] args) {
    Scanner scan = new Scanner(System.in);
    int count = Integer.parseInt(scan.nextLine());
    LinearProbingHashST<String, Integer> lp =
                        new LinearProbingHashST<>();
    for (int i = 0; i < count; i++) {
        String[] tokens = scan.nextLine().split(" ");
        switch (tokens[0]) {
        case "put":
            lp.put(tokens[1], Integer.parseInt(tokens[2]));
        break;
        case "get":
            System.out.println(lp.get(tokens[1]));
        break;
        case "delete":
            lp.delete(tokens[1]);
        break;
        case "display":
            System.out.println(lp);
        break;
        default:
        break;
      }
    }
  }
}
