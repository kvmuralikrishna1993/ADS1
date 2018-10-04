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
/**
 * Class for steque.
 *
 * @param      <E>   { parameter_description }
 */
class Steque<E> {
    /**
     * Class for node.
     */
    private class Node {
        /**
         * { var_data }.
         */
        private E data;
        /**
         * { var_node}.
         */
        private Node next;
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
    public void enqueue(final E data) {
        if (size() == 0) {
            push(data);
        } else {
            Node node = new Node();
            node.data = data;
            size++;
            tail.next = node;
            tail = tail.next;
        }
    }
    /**
     * { function_push }
     *
     * @param      data  The data
     */
    public void push(final E data) {
        Node node = new Node();
        node.data = data;
        size++;
        node.next = head;
        if (head == null) {
            head = node;
            tail = head;
            return;
        }
        head = node;
    }
    /**
     * { function_pop }
     */
    public void pop() { //throws EmptyException{
        if (!isEmpty()) {
            head = head.next;
            size--;
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
     * { function_print}.
     */
    public void print() {
        if (size == 0) {
            System.out.println("Steque is empty.");
        } else {
            Node thead = head;
            String str = "";
            while (thead != null) {
                str += thead.data + ", ";
                thead = thead.next;
            }
            str = str.substring(0, str.length() - 2);
            System.out.println(str);

        }
    }
}
