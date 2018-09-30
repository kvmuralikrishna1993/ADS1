import java.util.Scanner;
/**
 * Class for deque.
 *
 * @param      <E>   { parameter_description }
 */
/**
 * Exception for signaling invalid question errors.
 */
class EmptyException extends Exception {
    /**
     * Constructs the object.
     *
     * @param      s     { parameter_description }
     */
    EmptyException(final String s) {
        super(s);
    }
}
class Deque<E> {
	/**
	 * Class for node.
	 */
	private class Node {
		E data;
		Node next;
	}
	/**
	 * { head, tail }.
	 */
	private Node head, tail;
	/**
	 * { var size }.
	 */
	private int size = 0;
	/**
	 * { function_push right }.
	 *
	 * @param      data  The data
	 */
	public void pushright(E data) {
		//System.out.println(data);
		Node node = new Node();
		node.data = data;
		size++;
		if (tail == null) {
			tail = node;
			head = node;
			print();
			return;
		}
		tail.next = node;
		tail = tail.next;
		print();
	}
	/**
	 * { function_push left }.
	 *
	 * @param      data  The data
	 */
	public void pushleft(E data) {
		Node node = new Node();
		node.data = data;
		size++;
		if (head == null) {
			tail = node;
			head = node;
			print();
			return;
		}
		node.next = head;
		head = node;
		print();
	}
	/**
	 * { function_popleft }.
	 *
	 * @return     { data }.
	 */
	public E popleft() throws EmptyException {
		if (size() > 0) {
			E data = head.data;
			head = head.next;
			size--;
			return data;
		} else {
			throw new EmptyException("Deck is empty");
		}
	}
	/**
	 * { function_popright }.
	 *
	 * @return     { data }.
	 */
	public E popright() throws EmptyException {
		if (size() > 0) {
			E data = tail.data;
			size--;
			Node thead = head;
			while (thead.next != tail) {
				thead = thead.next;
			}
			thead.next = null;
			tail = thead;
			return data;
		} else {
			throw new EmptyException("Deck is empty");
		}
	}
	/**
	 * { function_size }.
	 *
	 * @return     { size value }.
	 */
	public int size() {
		return size;
	}
	/**
	 * Determines if empty.
	 *
	 * @return     True if empty, False otherwise.
	 */
	public boolean isEmpty() {
		return size == 0;
	}
	/**
	 * { function_print}
	 */
	public void print() {
		Node thead = head;
		if (size == 0) {
			System.out.println("[]");
			return;
		}
		String str = "[";
		while (thead != null){
			str += thead.data +", ";
			thead = thead.next;
		}
		str = str.substring(0,str.length() - 2)+"]";
		System.out.println(str);
	}

}
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
	 * { function_main}
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Deque<String> d = new Deque<>();
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while(sc.hasNext()) {
        	String input = sc.nextLine();
        	String[] tokens = input.split(" ");
        	switch (tokens[0]) {
        	case "pushRight":
            	d.pushright(tokens[1]);
            break;
            case "pushLeft":
            	d.pushleft(tokens[1]);
            break;
            case "popRight":
            try {
          		d.popright();
            	d.print();
            } catch (Exception e) {
            	System.out.println(e.getMessage());
        	}
            break;
            case "popLeft":
            try {
            	d.popleft();
            	d.print();
            } catch (Exception e) {
            	System.out.println(e.getMessage());
        	}
            break;
            case "size":
            	System.out.println(d.size());
            break;
            default:
        }
        }	
	}
}
