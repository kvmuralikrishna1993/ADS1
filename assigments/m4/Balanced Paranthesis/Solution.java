import java.util.Scanner;
/**
 * { item_description }.
 */
public final  class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    /**
     * { function_main }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] lines = line.split("");
            LinkedList<String> l = new LinkedList<String>();
            if (lines.length % 2 != 0) {
                    System.out.println("NO"); //check even length.
            } else {
                for (int j = 0; j < lines.length; j++) {
                    if (lines[j].equals("{") || lines[j].equals("[")
                        || lines[j].equals("(")) {  //push.
                        l.push(lines[j]);
                    } else if (lines[j].equals("}") && l.size() > 0) {
                        if (!(l.pop().toString().equals("{"))) {
                            System.out.println("NO"); //pop1.
                            break;
                        }
                    } else if (lines[j].equals("]") && l.size() > 0) {
                        if (!(l.pop().toString().equals("["))) {
                            System.out.println("NO"); //pop2.
                            break;
                        }
                    } else if (lines[j].equals(")") && l.size() > 0) {
                        if (!(l.pop().toString().equals("("))) {
                            System.out.println("NO"); //pop3.
                            break;
                        }
                    }
                    if (j == lines.length - 1) {
                        if (l.isEmpty()) {              //empty.
                            System.out.println("YES");
                        } else {                        //not empty.
                            System.out.println("NO");
                        }
                    }
                }
            }
        }
    }
}
