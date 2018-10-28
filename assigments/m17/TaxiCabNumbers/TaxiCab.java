/**
 * Class for taxi cab.
 */
class TaxiCab implements Comparable<TaxiCab> {
    /**
     * Sum.
     */
    private long total;
    /**
     * i value.
     */
    private long a;
    /**
     * j value.
     */
    private long b;
    /**
     * Constructs the object.
     *
     * @param      args1     { parameter_description }
     * @param      args2     { parameter_description }
     */
    TaxiCab(final long args1, final long args2) {
        this.total = args1 * args1 * args1 + args2 * args2 * args2;
        this.a = args1;
        this.b = args2;
    }
    /**
     * Compares the values.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final TaxiCab that) {
        if (this.total < that.total) {
            return -1;
        }
        if (this.total > that.total) {
            return +1;
        }
        return 0;
    }
    /**
     * Gets the total.
     *
     * @return     The total.
     */
    public long getSum() {
        return total;
    }
    /**
     * Gets i.
     *
     * @return     I.
     */
    public long getI() {
        return this.a;
    }
    /**
     * Gets the j.
     *
     * @return     The j.
     */
    public long getJ() {
        return this.b;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return total + " = " + a + "^3" + " + " + b + "^3";
    }

}