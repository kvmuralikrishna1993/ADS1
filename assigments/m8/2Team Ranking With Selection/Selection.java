import java.util.Comparator;
/**
 * Class for selection.
 */
public class Selection {

    // This class should not be instantiated.
    Selection() { }

    /**
     * Rearranges the array in ascending order, using the natural order.
     * @param a the array to be sorted
     */
    public void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
            assert isSorted(a, 0, i);
        }
        assert isSorted(a);
    }

    /**
     * Rearranges the array in ascending order, using a comparator.
     * @param a the array
     * @param comparator the comparator specifying the order
     */
    public void sort(Object[] a, Comparator comparator) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (less(comparator, a[j], a[min])) min = j;
            }
            exch(a, i, min);
            assert isSorted(a, comparator, 0, i);
        }
        assert isSorted(a, comparator);
    }


   /***************************************************************************
    *  Helper sorting functions.
    ***************************************************************************/
    
    // is v < w ?
    private boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    // is v < w ?
    private boolean less(Comparator comparator, Object v, Object w) {
        return comparator.compare(v, w) < 0;
    }
        
        
    // exchange a[i] and a[j]
    private void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }


   /***************************************************************************
    *  Check if array is sorted - useful for debugging.
    ***************************************************************************/

    // is the array a[] sorted?
    private boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }
        
    // is the array sorted from a[lo] to a[hi]
    private boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

    // is the array a[] sorted?
    private boolean isSorted(Object[] a, Comparator comparator) {
        return isSorted(a, comparator, 0, a.length - 1);
    }

    // is the array sorted from a[lo] to a[hi]
    private boolean isSorted(Object[] a, Comparator comparator, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(comparator, a[i], a[i-1])) return false;
        return true;
    }
    // print array to standard output
    public void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1) {
                System.out.print(",");
            }
        }
    }
}
