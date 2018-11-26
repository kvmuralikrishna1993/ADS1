import java.util.Scanner;
public class Solution {
	private Solution() {

	}
	public static void main(final String[] args) {
		//final int three = 3;
		Scanner scan = new Scanner(System.in);
		int count1 = Integer.parseInt(scan.nextLine());
		BinarySearchST bst = new BinarySearchST(count1);
		for(int i = 0; i < count1; i++) {
			String[] tokens = scan.nextLine().split(",");
			bst.put(tokens[0],
				new Student(tokens[0], tokens[1],
					Double.parseDouble(tokens[2])));
		}
		int count2 = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < count2; i++) {
			String[] tokens = scan.nextLine().split(" ");
			//System.out.println(tokens.lengt
			if (tokens[2].equals("1")) {
				Student s = bst.get(tokens[1]).toString();
				//String[] ans = bst.get(tokens[1]).toString().split(",");
				//System.out.println(ans[0]);
			} else if (tokens[2].equals("2")) {
			}
		}
	}
}

class Student implements Comparable<Student> {
	private String roll;
	private String name;
	public Double totalmarks;
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
	public String getname() {
		return this.name;
	}
	public String getroll() {
		return this.roll;
	}
	public Double gettotal() {
		return this.totalmarks;
	}
}
