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
        final int thousand = 1000;
        final int fivehund = 1500;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        MinPQ<TaxiCab> combinations = new MinPQ<TaxiCab>();
        for (int i = 1; i <= thousand; i++) {
            combinations.insert(new TaxiCab(i, i));
        }
        TaxiCab prev = new TaxiCab(0, 0);
        long sum = 0;
        int p = 1;
        int k = 0;
        while (true) {
            TaxiCab c = combinations.delMin();
            if (prev.getSum() == c.getSum()) {
                p++;
                if (p == m) {
                    sum = c.getSum();
                    if (++k == n) {
                        break;
                    }
                }
            } else {
                p = 1;
            }
            prev = c;
            if (c.getJ() < fivehund) {
                combinations.insert(new TaxiCab(c.getI(), c.getJ() + 1));
            }
        }
        System.out.println(sum);
    }
}
