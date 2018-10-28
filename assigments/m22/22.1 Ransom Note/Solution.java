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
        SeparateChainingHashST<String, Integer> h
        = new SeparateChainingHashST();
        int k = sc.nextInt();
        int l = sc.nextInt();
        sc.nextLine();
        String[] para = sc.nextLine().split(" ");
        for (int i = 0; i < para.length; i++) {
            if (h.contains(para[i])) {
                h.put(para[i], h.get(para[i]) + 1);
            } else {
                h.put(para[i], 1);
            }
        }
        String[] para2 = sc.nextLine().split(" ");
        for (int i = 0; i < para2.length; i++) {
            if (h.contains(para2[i])) {
                if (h.get(para2[i]) == 0) {
                    System.out.print("No");
                    return;
                } else {
                    h.put(para2[i], h.get(para2[i]) - 1);
                }
            } else {
                System.out.print("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
