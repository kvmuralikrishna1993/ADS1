
import java.util.Comparator;
/**
 * Class for insertion.
 */
class Insertion {
    /**
     * Constructs the object.
     */
    Insertion() { }
    /**
     * { function_sort }.
     *
     * @param      a     { parameter_description }
     */
    public void sort(final Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
            assert isSorted(a, 0, i);
        }
        assert isSorted(a);
    }
    /**
     * { function_sort }.
     *
     * @param      a     { parameter_description }
     * @param      lo    The lower
     * @param      hi    The higher
     */
    public void sort(final Comparable[] a, final int lo, final int hi) {
        for (int i = lo; i < hi; i++) {
            for (int j = i; j > lo && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
        assert isSorted(a, lo, hi);
    }
    /**
     * { function_sort }.
     *
     * @param      a           { parameter_description }
     * @param      comparator  The comparator
     */
    public void sort(final Object[] a, final Comparator comparator) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1], comparator); j--) {
                exch(a, j, j - 1);
            }
            assert isSorted(a, 0, i, comparator);
        }
        assert isSorted(a, comparator);
    }
    /**
     * { function_sort}.
     *
     * @param      a           { parameter_description }
     * @param      lo          The lower
     * @param      hi          The higher
     * @param      comparator  The comparator
     */
    public void sort(final Object[] a, final int lo, final int hi,
        final Comparator comparator) {
        for (int i = lo; i < hi; i++) {
            for (int j = i; j > lo && less(a[j], a[j - 1], comparator); j--) {
                exch(a, j, j - 1);
            }
        }
        assert isSorted(a, lo, hi, comparator);
    }
    /**
     * { function_sort}.
     *
     * @param      a     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int[] indexSort(final Comparable[] a) {
        int n = a.length;
        int[] index = new int[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && less(a[index[j]], a[index[j - 1]]); j--) {
                exch(index, j, j - 1);
            }
        }
        return index;
    }
    /**
     * { function_less}.
     *
     * @param      v     { parameter_description }
     * @param      w     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    private boolean less(final Comparable v, final Comparable w) {
        return v.compareTo(w) < 0;
    }
    /**
     * { function_less}.
     *
     * @param      v           { parameter_description }
     * @param      w           { parameter_description }
     * @param      comparator  The comparator
     *
     * @return     { description_of_the_return_value }
     */
    private boolean less(final Object v, final Object w,
        final Comparator comparator) {
        return comparator.compare(v, w) < 0;
    }
    /**
     * { function_exchange}.
     *
     * @param      a     { parameter_description }
     * @param      i     { parameter_description }
     * @param      j     { parameter_description }
     */
    private void exch(final Object[] a, final int i, final int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    /**
     * { function_exchange}.
     *
     * @param      a     { parameter_description }
     * @param      i     { parameter_description }
     * @param      j     { parameter_description }
     */
    private void exch(final int[] a, final int i, final int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    /**
     * Determines if sorted.
     *
     * @param      a     { parameter_description }
     *
     * @return     True if sorted, False otherwise.
     */
    private boolean isSorted(final Comparable[] a) {
        return isSorted(a, 0, a.length);
    }
    /**
     * Determines if sorted.
     *
     * @param      a     { parameter_description }
     * @param      lo    The lower
     * @param      hi    The higher
     *
     * @return     True if sorted, False otherwise.
     */
    private boolean isSorted(final Comparable[] a, final int lo,
        final int hi) {
        for (int i = lo + 1; i < hi; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
    /**
     * Determines if sorted.
     *
     * @param      a           { parameter_description }
     * @param      comparator  The comparator
     *
     * @return     True if sorted, False otherwise.
     */
    private boolean isSorted(final Object[] a, final Comparator comparator) {
        return isSorted(a, 0, a.length, comparator);
    }
    /**
     * Determines if sorted.
     *
     * @param      a           { parameter_description }
     * @param      lo          The lower
     * @param      hi          The higher
     * @param      comparator  The comparator
     *
     * @return     True if sorted, False otherwise.
     */
    private boolean isSorted(final Object[] a, final int lo,
        final int hi, final Comparator comparator) {
        for (int i = lo + 1; i < hi; i++) {
            if (less(a[i], a[i - 1], comparator)) {
                return false;
            }
        }
        return true;
    }
    /**
     * { function_show }.
     *
     * @param      a     { parameter_description }
     */
    public void show(final Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.println();
            }
        }
        System.out.println();
    }
    /**
     * { function_selected seats}.
     *
     * @param      a      { parameter_description }
     * @param      oc     { parameter_description }
     * @param      bc     { parameter_description }
     * @param      sc     The screen
     * @param      st     { parameter_description }
     * @param      total  The total
     */
    public void seats(final Comparable[] a, final int oc, final int bc,
        final int sc, final int st, final int total) {
        System.out.println();
        for (int i = 0; i < oc; i++) {
            System.out.print(a[i]);
            if (i < a.length - 1) {
                System.out.println();
            }
        }
        int bc1 = bc;
        for (int i = oc; i < total; i++) {
            String str = a[i].toString();
            int val = str.indexOf("BC");
            if (val > 0) {
                System.out.println(a[i]);
                bc1--;
                if (bc1 < 0) {
                    break;
                }
            }
        }
        int st1 = st;
        for (int i = oc; i < total; i++) {
            String str = a[i].toString();
            int val = str.indexOf("ST");
            if (val > 0) {
                System.out.println(a[i]);
                st1--;
                if (st1 < 0) {
                    break;
                }
            }
        }
        int sc1 = sc;
        for (int i = oc; i < total; i++) {
            String str = a[i].toString();
            int val = str.indexOf("SC");
            if (val > 0) {
                System.out.println(a[i]);
                sc1--;
                if (sc1 < 0) {
                    break;
                }
            }
        }
    }
}
