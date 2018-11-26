import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
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
        final int three = 3;
        final int four = 4;
        final int five = 5;
        final int six = 6;
        Scanner scan = new Scanner(System.in);
        int studentsqualified = Integer.parseInt(scan.nextLine());
        Merit merit = new Merit(studentsqualified);
        int vacency = Integer.parseInt(scan.nextLine());
        int urvacency = Integer.parseInt(scan.nextLine());
        int bcvacency = Integer.parseInt(scan.nextLine());
        int scvacency = Integer.parseInt(scan.nextLine());
        int stvacency = Integer.parseInt(scan.nextLine());
        while (scan.hasNext()) {
            String[] details = scan.nextLine().split(",");
            merit.add(new Student(details[0], details[1], Integer.parseInt(details[2]
                ), Integer.parseInt(details[three]), Integer.parseInt(details[four]
                ), Integer.parseInt(details[five]), details[six]));
        }
        System.out.println(merit.meritlist());
        System.out.println();
        System.out.println(merit.allocation(vacency, urvacency, bcvacency, scvacency, stvacency));
    }
}