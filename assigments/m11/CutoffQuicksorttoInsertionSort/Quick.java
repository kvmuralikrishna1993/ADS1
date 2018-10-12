import java.util.Arrays;
/**
 * Class for quick.
 */
class Quick {
    /**
     * Constructs the object.
     */
    Quick() { }
    /**
     * { function_sort }.
     *
     * @param      a       { parameter_description }
     * @param      cutoff  The cutoff
     */
    public void sort(final Comparable[] a, final int cutoff) {
        sort(a, 0, a.length - 1, cutoff);
        assert isSorted(a);
        show(a);
    }
    /**
     * { function_sort }.
     *
     * @param      a       { parameter_description }
     * @param      lo      The lower
     * @param      hi      The higher
     * @param      cutoff  The cutoff
     */
    private void sort(final Comparable[] a,
        final int lo, final int hi, final int cutoff) {
        if (hi <= lo + cutoff - 1) {
            System.out.println("insertionSort called");
            insertionSort(a, lo, hi);
            return;
        }
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1, cutoff);
        sort(a, j + 1, hi, cutoff);
        assert isSorted(a, lo, hi);
    }
    /**
     * { function_partition }.
     *
     * @param      a     { parameter_description }
     * @param      lo    The lower
     * @param      hi    The higher
     *
     * @return     { description_of_the_return_value }
     */
    private int partition(final Comparable[] a,
        final int lo, final int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable v = a[lo];
        while (true) {
            while (less(a[++i], v)) {
                if (i == hi) {
                    break;
                }
            }
            while (less(v, a[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        System.out.println(Arrays.toString(a));
        return j;
    }
    /**
     * { function_less }.
     *
     * @param      v     { parameter_description }
     * @param      w     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    private boolean less(final Comparable v, final Comparable w) {
        if (v == w) {
            return false;
        }
        return v.compareTo(w) < 0;
    }
    /**
     * { function_exchange }.
     *
     * @param      a     { parameter_description }
     * @param      i     { parameter_description }
     * @param      j     { parameter_description }
     */
    private void exch(final Object[] a,
        final int i, final int j) {
        Object swap = a[i];
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
        return isSorted(a, 0, a.length - 1);
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
    private boolean isSorted(final Comparable[] a,
        final int lo, final int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            if (less(a[i], a[i - 1])) {
                return false;
            }
        }
        return true;
    }
        /**
     * { function_insertionsort }.
     *
     * @param      a     { parameter_description }
     * @param      lo    The lower
     * @param      hi    The higher
     */
    public void insertionSort(final Comparable[] a,
        final int lo, final int hi) {
        for (int i = lo; i <= hi; i++) {
            for (int j = i; j > lo && less(a[j], a[j - 1]); j--) {
                exch(a, j, j - 1);
            }
        }
        assert isSorted(a, lo, hi);
    }
    /**
     * { function_exchange }.
     *
     * @param      a     { parameter_description }
     * @param      i     { parameter_description }
     * @param      j     { parameter_description }
     */
    private void exch(final Comparable[] a, final int i, final int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
    /**
     * { function_show}.
     *
     * @param      a     { parameter_description }
     */
    public void show(final Comparable[] a) {
        System.out.println(Arrays.toString(a));
    }
}
