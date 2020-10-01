//package LinkedList;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
        head = new Node();
        size = 0;
    }

    public void add(Object item) {
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(item);
        size++;
    }

    public void add(int index, Object item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Good luck, private Ryan!");
        }
        Node curr = head;
        int i = 0;
        while (i != index) {
            curr = curr.next;
            i++;
        }
        curr.next = new Node(item, curr.next);
        size++;
    }

    public Object get(int index) {
        if (index < 0) {
            index = size + index;
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Good luck, private Ryan!");
        }

        Node curr = head;
        int i = 0;
        while (i - 1 != index) {
            curr = curr.next;
            i++;
        }
        return curr.item;
    }

    public boolean contains(Object item) {
        Node curr = head.next;
        while (curr != null) {
            if (curr.item.equals(item)) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public String toString() {
        String out = "";
        for (Node curr = head.next; curr != null; curr = curr.next) {
            out += curr.item + " ";
        }
        return out;
    }

    int remove(Object item) {
        Node curr = head.next;
        Node prev = head;
        int index = 0;
        while (curr != null) {
            if (curr.item.equals(item)) {
                break;
            }
            prev = curr;
            curr = curr.next;
            index++;
        }

        if (curr != null) {
            prev.next = curr.next;
            return index;
        }

        return -1;

        // head.next -> 7.next -> 6.next -> 10.next -> 11.next -> null
    }

    /**
     * Removes the object given the position and returns the removed object from the
     * LinkedList.
     * 
     * @param position represents the position of the object to be removed
     * @return the item that was removed
     */
    Object remove(int position) {
        Node curr = head.next;
        Node prev = head;
        int i = 0;
        while (i != position && i < size) {
            prev = curr;
            curr = curr.next;
            i++;
        }
        if (i < size) {
            prev.next = curr.next;
            return curr.item;
        }
        return null;
    }
}
