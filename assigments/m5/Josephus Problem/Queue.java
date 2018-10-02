import java.util.Iterator;
/**
 * Exception for signaling empty errors.
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
public class Queue<E> implements Iterable<E> {
	private class Node {
		E data;
		Node next;
	}
	private Node head, tail;
	private int size = 0;

	public void enqueue(E data) {
		Node node = new Node();
		node.data = data;
		size++;
		if (tail == null) {
			tail = node;
			head = node;
			return;
		}
		tail.next = node;
		tail = tail.next;
	}

	public E dequeue() {
			E data = head.data;
			head = head.next;
			size--;
			return data;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	public int size() {
		return size;
	}
	public Iterator iterator() {
		return new MyIterator(head);
	}

	private class MyIterator implements Iterator {
		Node current;

		public MyIterator(Node first) {
			current = first;
		}

		public boolean hasNext() {
			return current !=  null;
		}

		public void remove() {

		}

		public E next() {
			E data = current.data;
			current = current.next;
			return data;
		}
	}
}