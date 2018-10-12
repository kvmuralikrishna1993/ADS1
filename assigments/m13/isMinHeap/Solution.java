import java.util.Scanner;
/**
 * Class for minheap.
 */
class Minheap {
    /**
     * Constructs the object.
     */
    Minheap() {

    }
    /**
     * Determines if heap.
     *  Best case: O(1)
     *  worst case :O(n)
     *  Average case: O(n)
     *
     * @param      a     { parameter_description }
     *
     * @return     True if heap, False otherwise.
     */
    public boolean isHeap(final Comparable[] a) {
        for (int k = 0; k < a.length; k++) {
            if (2 * k + 1 < a.length && 2 * k + 2 < a.length) {
                if (a[k].compareTo(a[2 * k + 1]) > 0
                 || a[k].compareTo(a[2 * k + 2]) > 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
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
        Minheap m = new Minheap();
        Scanner sc = new Scanner(System.in);
        String datatype = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());
        if (datatype.equals("Integer")) {
            for (int i = 0; i < count; i++) {
                String[] strtokens = sc.nextLine().split(",");
                if (strtokens[0].equals("")) {
                    System.out.println("false");
                } else {
                    Integer[] tokens = new Integer[strtokens.length];
                    for (int j = 0; j < strtokens.length; j++) {
                        tokens[j] = Integer.parseInt(strtokens[j]);
                    }
                    System.out.println(m.isHeap(tokens));
                }
            }
        } else if (datatype.equals("Double")) {
            for (int i = 0; i < count; i++) {
                String[] strtokens = sc.nextLine().split(",");
                if (strtokens[0].equals("")) {
                    System.out.println("false");
                } else {
                    Double[] tokens = new Double[strtokens.length];
                    for (int j = 0; j < strtokens.length; j++) {
                        tokens[j] = Double.parseDouble(strtokens[j]);
                    }
                    System.out.println(m.isHeap(tokens));
                }
            }
        } else if (datatype.equals("Float")) {
            for (int i = 0; i < count; i++) {
                String[] strtokens = sc.nextLine().split(",");
                if (strtokens[0].equals("")) {
                    System.out.println("false");
                } else {
                    Float[] tokens = new Float[strtokens.length];
                    for (int j = 0; j < strtokens.length; j++) {
                        tokens[j] = Float.valueOf(strtokens[j]);
                    }
                    System.out.println(m.isHeap(tokens));
                }
            }
        } else {
            for (int i = 0; i < count; i++) {
                String[] tokens = sc.nextLine().split(",");
                if (tokens[0].equals("")) {
                    System.out.println("false");
                } else {
                    System.out.println(m.isHeap(tokens));
                }
            }
        }
    }
}
