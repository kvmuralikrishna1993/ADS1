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
        	Queue<Integer> q = new Queue<>();
        	String input = sc.nextLine();
        	String[] tokens = input.split(" ");
        	for (int i = 0; i < Integer.parseInt(tokens[0]); i++) {
				q.enqueue(i);
			}
			//System.out.println(q.size());
			int k = Integer.parseInt(tokens[1]);
			String str = "";
			while (q.size() > 1) {
				//------------------------------------------
				for (int i = 0; i < k - 1; i++) {
					//try {
						q.enqueue(q.dequeue());
					//} catch(Exception e) {
						//break;
					//}
				}
				//-------------------------------------------
				//try {
					System.out.print(q.dequeue() + " ");
				//} catch(Exception e) {
					//break;
				//}
				//-------------------------------------------
			}
			System.out.print(q.dequeue());
			System.out.println();
        }
	}
}