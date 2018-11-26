/**
 * Class for student.
 */
class Student implements Comparable<Student> {
	/**
	 * { var_description }
	 */
	private String roll;
	private String name;
	private Double totalmarks;
	Student(final String roll1, final String name1, final Double totalmarks1) {
		this.roll = roll1;
		this.name = name1;
		this.totalmarks = totalmarks1;
	}
	/**
	 * compare.
	 *
	 * @param      that  The that
	 *
	 * @return     { description_of_the_return_value }
	 */
	public int compareTo(final Student that) {
		if (this.name.compareTo(that.name) > 0) {
			return 1;
		} else if (this.name.compareTo(that.name) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
	public String toString() {
		return this.name;
	}
	public String getroll() {
		return this.roll;
	}
	public Double gettotal() {
		return this.totalmarks;
	}
}
