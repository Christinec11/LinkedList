//import LinkedList.*;

class ArrayList {
    private Object[] array;
    private int MAX_SIZE;
    private int size;
    
    public ArrayList() {
        MAX_SIZE = 16;
        size = 0;
        array = new Object[MAX_SIZE];
    }

    public void add(Object item) {
        if (size == MAX_SIZE) {
            Object[] temp = new Object[MAX_SIZE * 2]; // 32
            for (int i = 0; i < size; i++) {
                temp[i] = array[i]; // 16 copy
            }
            array = temp; // reference to the memory that temp points to
        }
        array[size++] = item; // 32, 16 of which are filled up with real numbers
    }

    public String toString() {
        String out = "";
        for (int i = 0; i < size; i++) {
            out += array[i] + " ";
        }
        return out;
    }
}

public class LearnList {
    public static void main(String[] args) {
        // Integer[], String[], Double[], Poop[]
        // [a,b,f,s,sa,g,fg,h,fg,er]
        // get(index) -> index [6]
        // set(index) -> a[4] = 78;
        // FIXED SIZE -> growth
        // wasting space
        // wasting time

        // problems
        // add
        // remove

        // ArrayList a = new ArrayList();

        // for (int i = 0; i < 30; i++)
        //     a.add(i);

        // System.out.println(a);

        LinkedList ll = new LinkedList();

        ll.add(0, "6");
        ll.add(1, "10");
        ll.add(1, "-18");
        ll.add("7");
        ll.add("32");
        //String a = "56456546456456", b = "56";
       // b = "56456546456456";

        //System.out.println(a == b);

        System.out.println(ll);
        ll.remove("-18");
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);
    }
}