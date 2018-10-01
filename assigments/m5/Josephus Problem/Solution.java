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
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (sc.hasNext()) {
        	Queue q = new Queue();
        	String input = sc.nextLine();
        	String[] tokens = input.split(" ");
        	for (int i = 0; i < Integer.parseInt(tokens[0]); i++) {
				q.enqueue(i);
			}
			int k = Integer.parseInt(tokens[1]);
			while (q.isEmpty()) {
				for (int i = 0; i < k - 1; i++) {
					q.enqueue(q.dequeue());
				}
				System.out.println(q.dequeue() + " "); 
			}

        }
	}
}