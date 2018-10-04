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
        int n = sc.nextInt();
        sc.nextLine();
        Steque<String> q = new Steque<>();
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] tokens = str.split(" ");
            switch (tokens[0]) {
                case "push":
                    q.push(tokens[1]);
                    q.print();
                break;
                case "pop":
                        q.pop();
                        q.print();
                break;
                case "enqueue":
                    q.enqueue(tokens[1]);
                    q.print();
                break;
                default:
                System.out.println();
                q = new Steque<>();
            }
        }
    }
}
