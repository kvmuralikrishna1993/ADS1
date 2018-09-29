/**
 * List of linkeds.
 *
 * @param      <E>   { parameter_description }
 */
class LinkedList<E> {
    /**
     * Class for node.
     */
    private class Node {
        E data;
        Node next;
    }
    /**
     * { var_head}
     */
    private Node head;
    /**
     * { var_size }
     */
    private int size = 0;
    /**
     * { function_push }.
     *
     * @param      data  The data
     */
    public void push(E data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        head = node;
        size++;
    }
    /**
     * { function_pop }.
     *
     * @return     { last value in stack }
     */
    public E pop() {
        E data = head.data;
        head = head.next;
        size--;
        return data;
    }
    /**
     * { function_size }
     *
     * @return     { size }
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
}