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
        while (sc.hasNext()) {
            Queue<Integer> q = new Queue<>();
            String input = sc.nextLine();
            String[] tokens = input.split(" ");
            for (int i = 0; i < Integer.parseInt(tokens[0]); i++) {
                q.enqueue(i);
            }
            //System.out.println(q.size());
            int k = Integer.parseInt(tokens[1]);
            String str = "";
            while (q.size() > 1) {
                //------------------------------------------
                for (int i = 0; i < k - 1; i++) {
                        q.enqueue(q.dequeue());
                }
                //-------------------------------------------
                    System.out.print(q.dequeue() + " ");
                //-------------------------------------------
            }
            System.out.print(q.dequeue());
            System.out.println();
        }
    }
}
