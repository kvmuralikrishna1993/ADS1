import java.util.Comparator;
/**
 * Class for reservation.
 */
class Reservation implements Comparable<Reservation>{
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
	 * @param      name      The name
	 * @param      date      The date
	 * @param      sub1      The sub 1
	 * @param      sub2      The sub 2
	 * @param      sub3      The sub 3
	 * @param      totalsub  The totalsub
	 * @param      reserv    The reserv
	 */
	Reservation(String name, long days, String sub1,
		String sub2, String sub3, String totalsub, String reserv) {
		this.name = name;
		this.days = days;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.totalsub = totalsub;
		this.reserv = reserv;
	}
	/**
     * { get_name}.
     *
     * @return     { name}.
     */
    public String toString() {
        return this.name+","+this.totalsub+","+this.reserv;
    }
    /**
     * { function_compare }.
     *
     * @param      that  The that
     *
     * @return     { description_of_the_return_value }
     */
	public int compareTo(Reservation that) {
		if (Integer.parseInt(this.totalsub) > Integer.parseInt(that.totalsub)) {
            return -1;
        } else if (Integer.parseInt(this.totalsub) < Integer.parseInt(that.totalsub)) {
            return 1;
        } else if (Integer.parseInt(this.sub3) > Integer.parseInt(that.sub3)) {
            return -1;
        } else if (Integer.parseInt(this.sub3) < Integer.parseInt(that.sub2)){
            return 1;
        } else if (Integer.parseInt(this.sub2) > Integer.parseInt(that.sub2)) {
            return -1;
        } else if (Integer.parseInt(this.sub2) < Integer.parseInt(that.sub2)){
            return 1;
        } else if (this.days < that.days) {
            return -1;
        } else if (this.days > that.days) {
            return 1;
        }  else if (this.reserv.equals("ST") || this.reserv.equals("SC") ||
        	this.reserv.equals("BC") && that.reserv.equals("ST")
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
    public int reser(String res) {
    	int re = 0;
    	if (res.equals("ST")){
    		re = 3;
    		return re;
    	} else if (res.equals("SC")){
    		re = 2;
    		return re;
    	} else if (res.equals("BC")){
    		re = 1;
    		return re;
    	} else {
    		return re;
    	}
    }
}
