import java.util.Arrays;
class Merge {
    Merge() { }
    private void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        assert isSorted(a, lo, mid);
        assert isSorted(a, mid+1, hi);
        // for (int k = lo; k <= hi; k++) {
        //     aux[k] = a[k]; 
        // }
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)              aux[k] = a[j++];
            else if (j > hi)               aux[k] = a[i++];
            else if (less(a[j], a[i]))     aux[k] = a[j++];
            else                           aux[k] = a[i++];
        }
        assert isSorted(aux, lo, hi);
    }
    private void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {
        //aux = a.clone();  
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
    public void sort(Comparable[] a) {
        Comparable[] aux = a.clone();
        sort(aux, a, 0, a.length-1);
        assert isSorted(a);
    }
    private boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }
    private boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }
    private boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }
    /**private void insertionSort(Comparable[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }
        }
    }*/
    public void insertionSort(Comparable[] a, int lo, int hi) {
        for (int i = lo; i <= hi; i++) {
            for (int j = i; j > lo && less(a[j], a[j-1]); j--) {
                exch(a, j, j-1);
            }
        }
        assert isSorted(a, lo, hi);
    }
    private void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}