class Percolation {
    boolean[][] opened;
    int top = 0;
    int bottom;
    int size;
    WQU wqu;
    int count = 0;
/**
 * Constructs the object.
 *
 * @param      N     { parameter_description }
 */
    public Percolation(int N) {
        opened = new boolean[N][N];
        size = N;
        bottom = N * N + 1;
        wqu = new WQU(N * N + 2);
    }
/**
 * { function_open and unioins}
 *
 * @param      row   The row
 * @param      col   The col
 */
    public void open(int row, int col) {
        if (isOpen(row, col)) return;
        count++;
        opened[row - 1][col - 1] = true;
        if (row == 1)
            wqu.union(top, getWQUIndex(row, col));
        if (row == size)
            wqu.union(getWQUIndex(row, col), bottom);
        if (row > 1 && isOpen(row - 1, col))
            wqu.union(getWQUIndex(row, col), getWQUIndex(row - 1, col));
        if (row < size && isOpen(row + 1, col))
            wqu.union(getWQUIndex(row, col), getWQUIndex(row + 1, col));
        if (col > 1 && isOpen(row, col - 1))
            wqu.union(getWQUIndex(row, col), getWQUIndex(row, col - 1));
        if (col < size && isOpen(row, col + 1))
            wqu.union(getWQUIndex(row, col), getWQUIndex(row, col + 1));
    }
/**
 * Determines if open.
 *
 * @param      row   The row
 * @param      col   The col
 *
 * @return     True if open, False otherwise.
 */
    public boolean isOpen(int row, int col) {
        return opened[row - 1][col - 1];
    }
/**
 * Determines if full.
 *
 * @param      row   The row
 * @param      col   The col
 *
 * @return     True if full, False otherwise.
 */
    public boolean isFull(int row, int col) {
        return wqu.connected(top, getWQUIndex(row, col));
    }
/**
 * { function_ checks_percolation }
 *
 * @return     { description_of_the_return_value }
 */
    public boolean percolates() {
        return wqu.connected(top, bottom);
    }
/**
 * Gets the wqu index.
 *
 * @param      row   The row
 * @param      col   The col
 *
 * @return     The wqu index.
 */
    private int getWQUIndex(int row, int col) {
        return size * (row - 1) + col;
    }
}