import java.util.Collection;

public class LinkedList<T> {
    private Node<T> head, tail;
    private int size;

    public LinkedList() {
        head = tail = null;
        size = 0;
    }

    public void randomChange() {
        
    }

    public LinkedList(T data) {
        head = tail = new Node<>(data);
        size = 1;
    }

    public LinkedList(Collection<T> list) {
        head = tail = null;
        size = 0;
        Node<T> curr = null;

        /* Iterate through each item in the list and add it.   */
        for (T item : list) {
            if (size == 0) {   /* If we are at the beginning, initialize the head. */
                head = new Node<>(item);
                curr = head;
            } else {    /* If we are in the middle or at the end of the list, simply append to the current pointer. */
                curr.next = new Node<>(item);
                curr.next.prev = curr;
                curr = curr.next;
            }
            size++;
        }

        /* Finally, set the tail to be the last item in the list. */
        tail = curr;
    }

    public int Size() {
        return size;
    }

    public T GetHead() {
        return head.data;
    }

    public T GetTail() {
        return tail.data;
    }

    private class Node<E> {
        E data;
        Node<E> next, prev;

        Node() {
            data = null;
            next = prev = null;
        }

        Node(E data) {
            this.data = data;
            next = prev = null;
        }

        public E getData() {
            return data;
        }

        public void setData(E data) {
            this.data = data;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }
}
