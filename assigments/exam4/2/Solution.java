import java.util.Scanner;
public class Solution {
	private Solution() {

	}
	public static void main(final String[] args) {
		//final int three = 3;
		Scanner scan = new Scanner(System.in);
		int count1 = Integer.parseInt(scan.nextLine());
		BST bst = new BST();
		for(int i = 0; i < count1; i++) {
			String[] tokens = scan.nextLine().split(",");
			bst.put(tokens[2],
				new Student(tokens[0], tokens[1],
					Double.parseDouble(tokens[2])));
		}
		int count2 = Integer.parseInt(scan.nextLine());
		for (int i = 0; i < count2; i++) {
			String[] tokens = scan.nextLine().split(" ");
			if (tokens[0].equals("BE")) {
				bst.print(bst.root,tokens[1], tokens[2]);	
			} else if (tokens[0].equals("LE")) {
				bst.print(bst.root,bst.min(),tokens[1]);
			} else if (tokens[0].equals("GE")) {
				bst.print(bst.root,tokens[1],bst.max()) ;
			}			
		}
	}
}  