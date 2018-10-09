/**
 * List of linkeds.
 */
public class LinkedList {
    /**
     * { var_head }.
     */
    private Node head;
    /**
     * { var_size }.
     */
    private int size = 0;
    /**
     * Class for node.
     */
    private class Node {
        /**
        * data.
        */
        private int data;
        /**
        * next.
        */
        private Node next;
        /**
         * Constructs the object.
         *
         * @param      data1  The data 1
         * @param      next1  The next 1
         */
        Node(final int data1, final Node next1) {
            this.data = data1;
            this.next = next1;
        }
    }
    /**
     * { function_insert}.
     *
     * @param      position  The position
     * @param      data      The data
     */
    public void insertAt(final int position, final int data) {
        head = insertHelper(head, position, data);
        size++;
    }
    /**
     * { function_helper }.
     *
     * @param      head1  The head 1
     * @param      cnt    The count
     * @param      ele    The ele
     *
     * @return     { description_of_the_return_value }
     */
    public Node insertHelper(final Node head1, final int cnt, final int ele) {
        if (cnt == 0) {
            return new Node(ele, head1);
        }
        head1.next = insertHelper(head1.next, cnt - 1, ele);
        return head1;
    }
    /**
     * reverse.
     */
    public void reverse() {
        head = reverseHelper(head);
    }
    /**
     * { function_helper}.
     *
     * @param      head1  The head 1
     *
     * @return     { description_of_the_return_value }
     */
    Node reverseHelper(final Node head1) {
        if (head1 == null || head1.next == null) {
            return head1;
        }
        Node nhead = reverseHelper(head1.next);
        head1.next.next = head1;
        head1.next = null;
        return nhead;
    }
    /**
     * { function_size }.
     *
     * @return     { description_of_the_return_value }.
     */
    public int size() {
        return size;
    }
    /**
     * print.
     *
     * @return     { description_of_the_return_value }.
     */
    public String print() {
        Node thead = head;
        String s  = "";
        while (thead != null) {
            s += thead.data + ", ";
            thead = thead.next;
        }

        return s.substring(0, s.length() - 2);
    }
}
