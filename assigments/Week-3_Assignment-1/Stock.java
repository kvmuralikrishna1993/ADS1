import java.lang.Math;
/**
 * Class for stock.
 */
class Stock implements Comparable<Stock> {
	/**
	 * { var_description }
	 */
	private String name;
	/**
	 * { var_description }
	 */
	private Double value;
	/**
	 * Constructs the object.
	 */
	Stock() {

	}
	/**
	 * Constructs the object.
	 *
	 * @param      name1   The name 1
	 * @param      value1  The value 1
	 */
	Stock(String name1, double value1) {
		this.name = name1;
		this.value = value1;
	}
	/**
	 * { function_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
	public String getname() {
		return this.name;
	}
	/**
	 * { function_description }
	 *
	 * @return     { description_of_the_return_value }
	 */
	public Double getvalue() {
		return this.value;
	}
	/**
	 * { function_description }
	 *
	 * @param      that  The that
	 *
	 * @return     { description_of_the_return_value }
	 */
	public int compareTo(Stock that) {
        if (this.getvalue() > that.getvalue()) {
            return 1;
        } else if (this.getvalue() < that.getvalue()) {
            return -1;
        } else if (this.getname().compareTo(that.getname()) < 0){
            return -1;
        } else if (this.getname().compareTo(that.getname()) < 0){
            return 1;
        } else {
            return 0;
        }
    }
 }
