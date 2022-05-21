class Node {
    int data;
    Node next;
    Node (int x) {
        data = x;
    }
}

class MyStackNewTwo {
    Node head;
    int size;
    MyStackNewTwo() {
        head = null;
        size = 0;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return head == null;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Empty stack");
            return Integer.MIN_VALUE;
        }
        return head.data;
    }

    void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Empty stack");
            return Integer.MIN_VALUE;
        }
        int res = head.data;
        head = head.next;
        size--;
        return res;
    }
}

public class LinkedListImplementation {
    public static void main(String[] args) {
        MyStackNewTwo s=new MyStackNewTwo();
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.peek());
        System.out.println(s.isEmpty());
    }
}
