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
     * { function_main}.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Selection sel = new Selection();
        Scanner sc = new Scanner(System.in);
        final int size  = 10;
        Game[] t = new Game[size];
        final int three = 3;
        int count = 0;
        while (sc.hasNext()) {
            String temp = sc.nextLine();
            String[] tokens  = temp.split(",");
            t[count++] = new Game(tokens[0], tokens[1],
                tokens[2], tokens[three]);
        }
        Game[] teams = new Game[count];
        for (int i = 0; i < count; i++) {
            teams[i] = t[i];
        }
        sel.sort(teams);
        sel.show(teams);
    }
 }
