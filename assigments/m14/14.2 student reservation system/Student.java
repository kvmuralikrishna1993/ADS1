/**
 * Class for student.
 */
public class Student {
    /**
     * Variable to store name.
     */
    private String name;
    /**
     * Variable to store dob.
     */
    private String dob;
    /**
     * Variable to store sub1.
     */
    private Integer sub1;
    /**
     * Variable to store sub2.
     */
    private Integer sub2;
    /**
     * Variable to store sub3.
     */
    private Integer sub3;
    /**
     * Variable to store total.
     */
    private Integer total;
    /**
     * Variable to store category.
     */
    private String cat;
    /**
     * Variable to store allocation.
     */
    private boolean allocation;
    /**
     * Variable to store day.
     */
    private Integer day;
    /**
     * Variable to store month.
     */
    private Integer month;
    /**
     * Variable to store year.
     */
    private Integer year;
    /**
     * Constructs the object.
     */
    public Student() {

    }
    /**
     * Constructs the object.
     *
     * @param      name1    The student
     * @param      date    The dob
     * @param      s1     The subject 1 marks
     * @param      s2     The subject 2 marks
     * @param      s3     The subject 3 marks
     * @param      total1  The total
     * @param      reservation    The category
     */
    public Student(final String name1, final String date, final Integer s1,
                   final Integer s2, final Integer s3, final Integer total1,
                   final String reservation) {
        this.name = name1;
        this.dob = date;
        this.sub1 = s1;
        this.sub2 = s2;
        this.sub3 = s3;
        this.total = total1;
        this.cat = reservation;
        this.allocation = false;
        String[] birth = dob.split("-");
        this.day = Integer.parseInt(birth[0]);
        this.month = Integer.parseInt(birth[1]);
        this.year = Integer.parseInt(birth[2]);
    }
    /**
     * Returns a string representation of the object.
     * Complexity O(1)
     * @return     String representation of the object.
     */
    public String toString() {
        String str = "";
        str += this.name + "," + this.total + "," + this.cat;
        return str;

    }
    /**
     * Compares the function based on the parameters like marks, category etc.
     * Complexity O(1)
     * @param      other  The other
     *
     * @return     { description_of_the_return_value }
     */
    public int compareTo(final Student other) {
        if (this.total > other.total) {
            return 1;
        } else if (this.total < other.total) {
            return -1;
        } else if (this.sub3 > other.sub3) {
            return 1;
        } else if (this.sub3 < other.sub3) {
            return -1;
        } else if (this.sub2 > other.sub2) {
            return 1;
        } else if (this.sub2 < other.sub2) {
            return -1;
        } else if (this.sub1 > other.sub1) {
            return 1;
        } else if (this.sub1 < other.sub1) {
            return -1;
        } else if (this.year > other.year) {
            return 1;
        } else if (this.year < other.year) {
            return -1;
        } else if (this.month > other.month) {
            return 1;
        } else if (this.month < other.month) {
            return -1;
        } else if (this.day > other.day) {
            return 1;
        } else if (this.day < other.day) {
            return -1;
        } else {
            return 0;
        }
    }
    /**
     * Gets the allocation.
     *
     * @return     The allocation.
     */
    public boolean getAllocation() {
        return this.allocation;
    }
    /**
     * Sets the allocation.
     *
     * @param      y     { parameter_description }
     */
    public void setAllocation(final boolean y) {
        this.allocation = y;
    }
    /**
     * Gets the cat.
     *
     * @return     The cat.
     */
    public String getCat() {
        return this.cat;
    }
}
