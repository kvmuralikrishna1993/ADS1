import java.util.Scanner;
/**
 * Class for add large numbers.
 */
final class AddLargeNumbers {
    /**
     * Constructs the object.
     */
    private AddLargeNumbers() {
    }
    /**
     * { function_ number to digits }.
     *
     * @param      number  The number
     *
     * @return     { linked object}
     */
    public static LinkedList numberToDigits(final String number) {
        LinkedList<String> l = new LinkedList<String>();
        String[] numbers = number.split("");
        for (String each : numbers) {
            l.push(each);
        }
        return l;
    }
    /**
     * { function_digitsToNumber }.
     *
     * @param      list  The list
     *
     * @return     { number string }
     */
    public static String digitsToNumber(final LinkedList list) {
        int len = list.size();
        String str = "";
        for (int i = 0; i < len; i++) {
            str = list.pop() + str;
        }
        return str;
    }
    /**
     * Adds large numbers.
     *
     * @param      list1  The list 1
     * @param      list2  The list 2
     *
     * @return     { sum object }
     */
    public static LinkedList addLargeNumbers(
        final LinkedList list1, final LinkedList list2) {
        int sum = 0;
        int carry = 0;
        int x = 0;
        int y = 0;
        String str = "";
        final int rem = 10;
        final int condition = 9;
        while (!list1.isEmpty() || !list2.isEmpty()) {
            if (list1.size() > 0) {
                String digit = list1.pop().toString();
                x = Integer.parseInt(digit);
            } else {
                x = 0;
            }
            if (list2.size() > 0) {
                String digit = list2.pop().toString();
                y = Integer.parseInt(digit);
            } else {
                y = 0;
            }
            sum = x + y + carry;
            if (sum > condition) {
                carry = 1;
            } else {
            carry = 0;
            }
            str = Integer.toString(sum % rem) + str;
            if (list1.isEmpty() && list2.isEmpty()) {
                str = Integer.toString(carry) + str;
            }
        }
        if ("0".equals(str.substring(0, 1))) {
            str = str.substring(1);
        }
        return numberToDigits(str);
    }
}
/**
 * Class for solution.
 */
public final class Solution {
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
        String input = sc.nextLine();
        String p = sc.nextLine();
        String q = sc.nextLine();
        switch (input) {
            case "numberToDigits":
                LinkedList pDigits = AddLargeNumbers.numberToDigits(p);
                LinkedList qDigits = AddLargeNumbers.numberToDigits(q);
                System.out.println(AddLargeNumbers.digitsToNumber(pDigits));
                System.out.println(AddLargeNumbers.digitsToNumber(qDigits));
                break;
            case "addLargeNumbers":
                pDigits = AddLargeNumbers.numberToDigits(p);
                qDigits = AddLargeNumbers.numberToDigits(q);
                LinkedList result = AddLargeNumbers.addLargeNumbers(
                    pDigits, qDigits);
                System.out.println(AddLargeNumbers.digitsToNumber(result));
                break;
            default:
        }
    }
}
