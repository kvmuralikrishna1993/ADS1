/**
 * Class for merge.
 */
class Merge {
    /**
     * Constructs the object.
     */
    Merge() { }
    /**
     * { function_merge }.
     *
     * @param      a     { parameter_description }
     * @param      aux   The auxiliary
     * @param      lo    The lower
     * @param      mid   The middle
     * @param      hi    The higher
     */
    private void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        assert isSorted(a, lo, mid);
        assert isSorted(a, mid+1, hi);
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)              aux[k] = a[j++];
            else if (j > hi)               aux[k] = a[i++];
            else if (less(a[j], a[i]))     aux[k] = a[j++];
            else                           aux[k] = a[i++];
        }
        assert isSorted(aux, lo, hi);
    }
    /**
     * { function_sort }.
     *
     * @param      a     { parameter_description }
     * @param      aux   The auxiliary
     * @param      lo    The lower
     * @param      hi    The higher
     */
    private void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        if (hi <= lo + 7) {
            System.out.println("Insertion sort method invoked...");
            insertionSort(aux, lo, hi);
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(aux, a, lo, mid);
        sort(aux, a, mid + 1, hi);
        if (!less(a[mid+1], a[mid])) {
            for(int i = lo; i <= hi; i++) {
                aux[i] = a[i];
            }
            System.out.println("Array is already sorted. So, skipped the call to merge...");    
            return;
        }
        merge(a, aux, lo, mid, hi);
    }
    /**
     * { function_sort }.
     *
     * @param      a     { parameter_description }
     */
    public void sort(Comparable[] a) {
        Comparable[] aux = a.clone();
        sort(aux, a, 0, a.length-1);
        assert isSorted(a);
    }
    /**
     * { function_less }.
     *
     * @param      v     { parameter_description }
     * @param      w     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    private boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    /**
     * Determines if sorted.
     *
     * @param      a     { parameter_description }
     *
     * @return     True if sorted, False otherwise.
     */
    private boolean isSorted(Comparable[] a) {
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
    private boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }
    /**
     * { function_insertionsort }.
     *
     * @param      a     { parameter_description }
     * @param      lo    The lower
     * @param      hi    The higher
     */
    public void insertionSort(Comparable[] a, int lo, int hi) {
        for (int i = lo; i <= hi; i++) {
            for (int j = i; j > lo && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
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
    private void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}