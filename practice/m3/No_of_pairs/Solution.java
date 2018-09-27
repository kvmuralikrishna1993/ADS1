public class Solution{
	public static void main(String[] args) {
		String str = "11112";// input file
		char[] cArray = str.toCharArray();
		int count = 1;
		for (int i = 0; i < cArray.length;i++) { // n times
			int l = i+1;
			while( l < cArray.length ) {
				if (cArray[i] == cArray[l]) {
					count++;
					break;
				}l++;
			}
		}
		System.out.println(fact(count,2));
	}
	public static int fact(int args1, int args2) {
				if( args2 == 0 || args1 == args2)
			return 1;
		else
			return fact(args1 - 1,args2)+ fact(args1 - 1, args2 - 1);
	}
}