/**
 * List of linkeds.
 */
public class LinkedList {
    /**
    * head;
    */
    private Node head;
    /**
     * { var_size }
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
        * @param      data  The data
        * @param      next  The next
        */
        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    /**
     * insertAt.
     *
     * @param      position  The position
     * @param      data      The data
     *
     * @return     { description_of_the_return_value }
     */
    public void insertAt(int position, int data) {
        head = insertHelper(head, position , data);
        size++;
    }
    /**
     * insertHelper.
     *
     * @param      head  The head
     * @param      cnt   The count
     * @param      ele   The ele
     *
     * @return     { description_of_the_return_value }
     */
    public Node insertHelper(Node head, int cnt, int ele) {
        if (cnt == 0) {
            return new Node(ele, head);
        }
        head.next = insertHelper(head.next, cnt - 1 , ele);
        return head;
    }
    /**
     * reverse.
     */
    public void reverse() {
        head = reverseHelper(head);
    }
    /**
     * reverseHelper.
     *
     * @param      head  The head
     *
     * @return     { description_of_the_return_value }
     */
    Node reverseHelper(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node nhead = reverseHelper(head.next);
        head.next.next = head;
        head.next = null;
        return nhead;
    }
    /**
     * { function_size }.
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
        return size;
    }
    /**
     * print.
     *
     * @return     { description_of_the_return_value }
     */
    public String print() {
        Node thead = head;
        String s  = "";
        while (thead != null) {
            s += thead.data + ", ";
            thead = thead.next;
        }

        return s.substring(0 , s.length() - 2);
    }
}