import java.util.Scanner;
import java.util.Arrays;
public class Solution {
	private Solution() {

	}
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		Merge mim = new Merge();
		while(sc.hasNextLine()) {
			String[] tokens = sc.nextLine().split(",");
			mim.sort(tokens);
			System.out.println(Arrays.toString(tokens));
			System.out.println();
		}
	}
}