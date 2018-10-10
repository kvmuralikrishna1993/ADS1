import java.util.Scanner;
public class Solution {
	private Solution() {

	}
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		Merge mim = new Merge();
		while(sc.hasNextLine()) {
			String[] tokens = sc.nextLine().split(",");
			mim.sort(tokens);
			toString(tokens);
			System.out.println();
		}
	}
	public static void toString(String[] args) {
		String str = "[";
		for (int i = 0; i < args.length; i++) {
			str += args[i];
			if (i != args.length -1) {
				str += ", ";
			}
		}
		str += "]";
		System.out.println(str); 
	}
}
