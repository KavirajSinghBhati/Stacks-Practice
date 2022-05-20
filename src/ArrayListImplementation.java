import java.util.ArrayList;
import java.util.Scanner;

class MyStackNew {
    ArrayList<Integer> al = new ArrayList<>();
    void push(int x) {
        al.add(x);
    }
    int pop() {
        if (al.isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return al.remove(al.size() - 1);
    }
    int peek() {
        if (al.isEmpty()) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return al.get(al.size() - 1);
    }
    boolean isEmpty() {
        return al.isEmpty();
    }
    int size() {
        return al.size();
    }
}

public class ArrayListImplementation {
    public static void main(String[] args) {
        MyStackNew s = new MyStackNew();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (true) {
            System.out.println("ArrayList implementation of stack");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top item");
            System.out.println("4. Size");
            System.out.println("5. Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter ele to add");
                    int x = sc.nextInt();
                    s.push(x);
                }
                case 2 -> System.out.println("Popped value: " + s.pop());
                case 3 -> System.out.println("Top is: " + s.peek());
                case 4 -> System.out.println("Size: " + s.size());
                case 5 -> System.exit(0);
                default -> System.out.println("Wrong choice");
            }
        }
    }
}
