import java.util.Scanner;
/**
 * Class for solution.
 */
public class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {

	}
	/**
	 * { function_main }
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		Stock[][] stock = new Stock[6][count];
		Stock st = new Stock();
		MaxPQ<Stock> max = new MaxPQ<Stock>();
		MinPQ<Stock> min = new MinPQ<Stock>();
		for (int i = 0; i < 6; i++) {
			Stock[] starray = new Stock[count];
			for (int j = 0; j < count; j++) {
				String[] tokens = sc.nextLine().split(",");
				if (tokens[0].equals("")) {
				} else {
					starray[j] = new Stock(tokens[0], Double.parseDouble(tokens[1]));
				}
			}
			stock[i] = starray;
		}
		for (int i = 0; i < stock.length; i++) {
			for (int j = 0; j < stock[i].length; j++) {
				max.insert(stock[i][j]);
				min.insert(stock[i][j]);
			}
			for (int k = 0; k < 5; k++) {
				System.out.println(max.max().getname()+","+max.max().getvalue());
				max.delMax();
			}
			System.out.println();
			for (int k = 0; k < 5; k++) {
				System.out.println(min.min().getname()+","+min.min().getvalue());
				min.delMin();
			}
			System.out.println();
		}
	}
}