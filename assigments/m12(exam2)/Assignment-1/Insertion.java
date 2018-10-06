
import java.util.Comparator;
/**
 * Class for insertion.
 */
class Insertion {

    // This class should not be instantiated.
    Insertion() { }

    /**
     * Rearranges the array in ascending order, using the natural order.
     * @param a the array to be sorted
     */
    public void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }
            assert isSorted(a, 0, i);
        }
        assert isSorted(a);
    }

    /**
     * Rearranges the subarray a[lo..hi) in ascending order, using the natural order.
     * @param a the array to be sorted
     * @param lo left endpoint (inclusive)
     * @param hi right endpoint (exclusive)
     */
    public void sort(Comparable[] a, int lo, int hi) {
        for (int i = lo; i < hi; i++) {
            for (int j = i; j > lo && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }
        }
        assert isSorted(a, lo, hi);
    }

    /**
     * Rearranges the array in ascending order, using a comparator.
     * @param a the array
     * @param comparator the comparator specifying the order
     */
    public void sort(Object[] a, Comparator comparator) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1], comparator); j--) {
                exch(a, j, j-1);
            }
            assert isSorted(a, 0, i, comparator);
        }
        assert isSorted(a, comparator);
    }

    /**
     * Rearranges the subarray a[lo..hi) in ascending order, using a comparator.
     * @param a the array
     * @param lo left endpoint (inclusive)
     * @param hi right endpoint (exclusive)
     * @param comparator the comparator specifying the order
     */
    public void sort(Object[] a, int lo, int hi, Comparator comparator) {
        for (int i = lo; i < hi; i++) {
            for (int j = i; j > lo && less(a[j], a[j-1], comparator); j--) {
                exch(a, j, j-1);
            }
        }
        assert isSorted(a, lo, hi, comparator);
    }


    // return a permutation that gives the elements in a[] in ascending order
    // do not change the original array a[]
    /**
     * Returns a permutation that gives the elements in the array in ascending order.
     * @param a the array
     * @return a permutation {@code p[]} such that {@code a[p[0]]}, {@code a[p[1]]},
     *    ..., {@code a[p[n-1]]} are in ascending order
     */
    public int[] indexSort(Comparable[] a) {
        int n = a.length;
        int[] index = new int[n];
        for (int i = 0; i < n; i++)
            index[i] = i;

        for (int i = 0; i < n; i++)
            for (int j = i; j > 0 && less(a[index[j]], a[index[j-1]]); j--)
                exch(index, j, j-1);

        return index;
    }

   /***************************************************************************
    *  Helper sorting functions.
    ***************************************************************************/    
    // is v < w ?
    private boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    // is v < w ?
    private boolean less(Object v, Object w, Comparator comparator) {
        return comparator.compare(v, w) < 0;
    }
        
    // exchange a[i] and a[j]
    private void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    // exchange a[i] and a[j]  (for indirect sort)
    private void exch(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

   /***************************************************************************
    *  Check if array is sorted - useful for debugging.
    ***************************************************************************/
    private boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length);
    }

    // is the array a[lo..hi) sorted
    private boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo+1; i < hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

    private boolean isSorted(Object[] a, Comparator comparator) {
        return isSorted(a, 0, a.length, comparator);
    }

    // is the array a[lo..hi) sorted
    private boolean isSorted(Object[] a, int lo, int hi, Comparator comparator) {
        for (int i = lo+1; i < hi; i++)
            if (less(a[i], a[i-1], comparator)) return false;
        return true;
    }

   // print array to standard output
    public void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1){
                System.out.println();
            }
        }
        System.out.println();
    }
    public void seats(Comparable[] a, int oc, int bc, int sc, int st, int total) {
        System.out.println();
        for (int i = 0; i < oc; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.println();
            }
        }
        bc = oc + bc;
        for (int i = oc; i < bc; i++) {
            String str = a[i].toString();
            int val = str.indexOf("BC");
            if (val > 0) {
                System.out.println(a[i]);
            }
        }
        int st1 = st; 
        st = st+bc+oc;
        for (int i = oc; i < st; i++) {
            String str = a[i].toString();
            int val = str.indexOf("ST");
            if (val > 0) {
                System.out.println(a[i]);
                st1--;
                if (st1 == 0) {
                    break;
                }
            }
        }
        int sc1 = sc;
        sc = total;
        for (int i = oc; i < sc; i++) {
            String str = a[i].toString();
            int val = str.indexOf("SC");
            if (val > 0) {
                System.out.println(a[i]);
                sc1--;
                if (sc1 == 0) {
                    break;
                }
            }
        }
    }
}
