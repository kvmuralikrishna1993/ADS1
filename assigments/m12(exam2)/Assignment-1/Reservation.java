/**
 * Class for reservation.
 */
class Reservation implements Comparable<Reservation> {
    /**
     * { var_name }.
     */
    private String name;
    /**
     * { var_date }.
     */
    private long days;
    /**
     * { var_subject1 }.
     */
    private String sub1;
    /**
     * { var_subject2 }.
     */
    private String sub2;
    /**
     * { var_subject3 }.
     */
    private String sub3;
    /**
     * { var_totalsub }.
     */
    private String totalsub;
    /**
     * { var_reserv }.
     */
    private String reserv;
    /**
     * Constructs the object.
     *
     * @param      name1      The name 1
     * @param      days1      The days 1
     * @param      sub11      The sub 11
     * @param      sub21      The sub 21
     * @param      sub31      The sub 31
     * @param      totalsub1  The totalsub 1
     * @param      reserv1    The reserv 1
     */
    Reservation(final String name1, final long days1, final String sub11,
        final String sub21, final String sub31, final String totalsub1,
        final String reserv1) {
        this.name = name1;
        this.days = days1;
        this.sub1 = sub11;
        this.sub2 = sub21;
        this.sub3 = sub31;
        this.totalsub = totalsub1;
        this.reserv = reserv1;
    }
    /**
     * { get_name}.
     *
     * @return     { name}.
     */
    public String toString() {
        return this.name + "," + this.totalsub + "," + this.reserv;
    }
    /**
     * { function_compare }.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final Reservation that) {
        if (Integer.parseInt(this.totalsub) > Integer.parseInt(that.totalsub)) {
            return -1;
        } else if (Integer.parseInt(this.totalsub)
            < Integer.parseInt(that.totalsub)) {
            return 1;
        } else if (Integer.parseInt(this.sub3) > Integer.parseInt(that.sub3)) {
            return -1;
        } else if (Integer.parseInt(this.sub3) < Integer.parseInt(that.sub2)) {
            return 1;
        } else if (Integer.parseInt(this.sub2) > Integer.parseInt(that.sub2)) {
            return -1;
        } else if (Integer.parseInt(this.sub2) < Integer.parseInt(that.sub2)) {
            return 1;
        } else if (this.days < that.days) {
            return -1;
        } else if (this.days > that.days) {
            return 1;
        }  else if (this.reserv.equals("ST") || this.reserv.equals("SC")
            || this.reserv.equals("BC") && that.reserv.equals("ST")
            || that.reserv.equals("SC") || that.reserv.equals("BC")) {
            int res1 = reser(this.reserv);
            int res2 = reser(that.reserv);
            if (res1 > res2) {
                return -1;
            } else {
                return 1;
            }
        } else {
          return 0;
        }
    }
    /**
     * { function_reser}.
     *
     * @param      res   The resource
     *
     * @return     { description_of_the_return_value }
     */
    public int reser(final String res) {
        int re = 0;
        final int three = 3;
        final int two = 2;
        final int one = 1;
        if (res.equals("ST")) {
            re = three;
            return re;
        } else if (res.equals("SC")) {
            re = two;
            return re;
        } else if (res.equals("BC")) {
            re = one;
            return re;
        } else {
            return re;
        }
    }
}
