import java.util.Scanner;
/**
 *this class is for main method.
 */
public final class Solution {
    /**
     *an empty constructor.
     */
    private Solution() {
    }
    /**
     *the main method is to.
     *take the input from user.
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        DynamicMedian obj = new DynamicMedian();
        long count = scan.nextLong();
        double element = scan.nextDouble();
        obj.insertAtMin(element);
        double med = element;
        System.out.println(med);
        for (long i = 1; i < count; i++) {
            double input = scan.nextDouble();
            if (input > med) {
                obj.insertAtMin(input);
            } else if (input < med) {
                obj.insertAtMax(input);
            } else {
                obj.insertAtMin(input);
            }
            if (obj.getMinSize() - obj.getMaxSize() > 1) {
                obj.insertAtMax(obj.delMin());
            }
            if (obj.getMaxSize() - obj.getMinSize()  > 1) {
                obj.insertAtMin(obj.delMax());
            }
            if (Math.abs(
                        obj.getMinSize() - obj.getMaxSize()) == 1) {
                if (obj.getMinSize() > obj.getMaxSize()) {
                    med = obj.getMin();
                    System.out.println(med);
                } else {
                    med = obj.getMax();
                    System.out.println(med);
                }
            }
            if (obj.getMinSize()  == obj.getMaxSize()) {
                double min = obj.getMin();
                double max = obj.getMax();
                med = (min + max) / 2.0;
                System.out.println(med);
            }
        }
    }
}
