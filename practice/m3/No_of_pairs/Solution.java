public class Solution{
	public static void main(String[] args) {
		String[] list = new String[10]; // input file
		for(String each : list) { // n times
			String tokens[] = each.split(","); // 2n
			if (tokens[0].equals(tokens[1])) {
				System.out.println(each); //total 3n ==> linear growth.
			}
		}
	}
}