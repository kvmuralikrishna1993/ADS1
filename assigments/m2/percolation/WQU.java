import java.util.Scanner;
/**
 * Class for wqu.
 */
class WQU {
    private int[] id;
    private int[] sz;    // access to component id (site indexed)
    private int count;    // number of components
    public WQU(int N) {  // Initialize component id array.
        count = N;
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
            sz[i] = 1;
        }
    }
    /**
     * { function_count }.
     *
     * @return     { description_of_the_return_value }
     */
    public int count() { 
        return count;
    }
    /**
     * { function_connected }.
     *
     * @param      p     { parameter_description }
     * @param      q     The quarter
     *
     * @return     { true or false }
     */
    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }
    /**
     * Searches for the first match.
     *
     * @param      p     { parameter_description }
     *
     * @return     { root }
     */
    public int find(int p) {
        while (p != id[p]) {
            id[p] = id[id[p]];
            p = id[p];
        }
            return p;
    }
    /**
     * { function_union }
     *
     * @param      p     { parameter_description }
     * @param      q     The quarter
     */
    public void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if   (sz[pRoot] < sz[qRoot]) {
            id[pRoot] = qRoot;
            sz[qRoot] += sz[pRoot];
        } else {
            id[qRoot] = pRoot;
            sz[pRoot] += sz[qRoot];
        }
        count--;
    }
}
